package com.experian.bis.api.lib.common.service;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.io.IOUtils;

import com.experian.bis.api.lib.common.BISServiceCredential;
import com.experian.bis.api.lib.common.BISServiceException;
import com.experian.bis.api.lib.common.ServiceEnvironment;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BISAuthenticationService {
	private Proxy proxy = null;
	
	public BISAuthenticationService() {
		this.proxy = proxy;
	}
	
	public BISAuthenticationService(Proxy proxy) {
		this.proxy = proxy;
	}
	
	public Proxy getProxy() {
		return proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	public BISServiceCredential getStageServiceCredential(String username, String password, String clientId, String clientSecret) throws BISServiceException {
		return getServiceCredential(username, password, clientId, clientSecret, ServiceEnvironment.STAGE);
	}
	
	public BISServiceCredential getProductionServiceCredential(String username, String password, String clientId, String clientSecret) throws BISServiceException {
		return getServiceCredential(username, password, clientId, clientSecret, ServiceEnvironment.PRODUCTION);
	}
	
	private BISServiceCredential getServiceCredential(String username, String password, String clientId, String clientSecret, ServiceEnvironment env) throws BISServiceException {
		BISServiceCredential credential = new BISServiceCredential();
		credential.setEnvironment(env);
		String authToken = "";
		String tokenServiceUrl = ResourceBundle.getBundle("config").getString("url.token."+env.id());
		String requestBody = "{\"username\": \""+username+"\",\"password\": \""+password+"\"}";
		URL url = null;
		URLConnection conn = null;
		boolean isHttps = false;
		try {
			url = new URL(tokenServiceUrl);
			conn = proxy!=null ? url.openConnection(proxy) : url.openConnection();
			conn.setUseCaches(false);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			byte[] postData = requestBody.getBytes(Charset.forName("UTF-8"));
			int postDataLength = postData.length;
			conn.setRequestProperty("Content-type", "application/json");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("client_id", clientId);
			conn.setRequestProperty("client_secret", clientSecret);
			DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
			wr.write(postData);
			wr.close();
			InputStream is = conn.getInputStream();
			String rawResponse = IOUtils.toString(is);
			is.close();
			Object authRespObj = (new ObjectMapper()).readValue(rawResponse, LinkedHashMap.class);
			authToken = (String) PropertyUtils.getProperty(authRespObj, "access_token");
			
		} catch (Exception ex) {
			throw new BISServiceException("BIS Service Authentication failed", ex);
		}
	
		credential.setAuthToken(authToken);
		return credential;
	}

}
