package com.experian.bis.api.lib.businessservices.service;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import com.experian.bis.api.lib.businessservices.bean.request.BusinessServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.BusinessServiceResponse;
import com.experian.bis.api.lib.common.BISErrorResult;
import com.experian.bis.api.lib.common.BISServiceCredential;
import com.experian.bis.api.lib.common.BISServiceException;
import com.experian.bis.api.lib.common.BISValidationException;
import com.experian.bis.api.lib.common.RequestMethod;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <code>BusinessService</code> is the parent class of all the Business Service
 * Classes. This is an abstract class. It has implementation of some of the
 * important common methods used by all other Business Service Classes.
 *
 */
public abstract class BusinessService {
	private static final String SERVICE_ID = "UNKNOWN";
	private BISServiceCredential serviceCredential = null;
	private ResourceBundle rBundle;
	private String rawServiceResponse;
	private Proxy proxy = null;

	/**
	 * Constructor with {@link java.net.Proxy} param type
	 * 
	 * @param proxy
	 */
	public BusinessService(Proxy proxy) {
		this.proxy = proxy;
	}

	/**
	 * No parameter/default Constructor
	 */
	public BusinessService() {
	}

	/**
	 * Constructor with
	 * {@link BISServiceCredential} param type
	 * 
	 * @param serviceCredential
	 */
	public BusinessService(BISServiceCredential serviceCredential) {
		this.serviceCredential = serviceCredential;
	}

	/**
	 * Constructor with
	 * {@link BISServiceCredential} and
	 * {@link java.net.Proxy} param type
	 * 
	 * @param serviceCredential
	 * @param proxy
	 */
	public BusinessService(BISServiceCredential serviceCredential, Proxy proxy) {
		this.serviceCredential = serviceCredential;
		this.proxy = proxy;
	}

	/**
	 * Returns the Raw String Response received from the Business Service. This
	 * method returns the service response, even in case of an exception when
	 * the service has returned an error.
	 * 
	 * @return rawServiceResponse
	 */
	public String getRawServiceResponse() {
		System.out.println(rawServiceResponse.toString());	
		return rawServiceResponse;
	}

	private void setRawServiceResponse(String rawServiceResponse) {
		this.rawServiceResponse = rawServiceResponse;
	}

	/**
	 * Returns the Service Credential set for this Business Service
	 * 
	 * @return
	 */
	public BISServiceCredential getServiceCredential() {
		return serviceCredential;
	}

	/**
	 * Sets Service Credential for this Business Service
	 * 
	 * @param serviceCredential
	 */
	public void setServiceCredential(BISServiceCredential serviceCredential) {
		this.serviceCredential = serviceCredential;
	}

	/**
	 * Returns the Proxy setting set for this Business Service
	 * 
	 * @return
	 */
	public Proxy getProxy() {
		return proxy;
	}

	/**
	 * Sets the Proxy Settings for this Business Service
	 * 
	 * @param proxy
	 */
	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	/**
	 * This method constructs the String Business Service request (in JSON format) from 
	 * the given {@link BusinessServiceRequest} param
	 * @param businessServiceRequest
	 * @return
	 * @throws BISServiceException
	 */
	protected String constructPostRequestBody(BusinessServiceRequest businessServiceRequest)
			throws BISServiceException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(businessServiceRequest);
		} catch (JsonProcessingException e) {
			throw new BISServiceException("Failed to create Service Request", e);
		}
	}

	/**
	 * Returns the URL of this Business Service. The returned value is dependent on the 
	 * Service Class and Environment. The value is read from config.properties file
	 * @return
	 * @throws BISServiceException
	 */
	protected String getServiceUrl() throws BISServiceException {
		if(this.getClass().equals(BusinessService.class))
			throw new BISServiceException("Service URL can't be retrieved. The method is invoked on an unsupported parent object of the actual Service Class.");
		
		rBundle = ResourceBundle.getBundle("config");
		String url = "";
		try {
			url = rBundle.getString("url.prefix." + serviceCredential.getEnvironment().id())
					+ rBundle.getString("url.suffix." + getServiceId());
		} catch (Exception e) {
			throw new BISServiceException("Service URL can't be retrieved. Environment or Service is not valid.");
		}
		return url;
	}

	/**
	 * Returns a Map<String, String> of common request headers required to invoke 
	 * Business Services APIs
	 * @return
	 */
	protected Map<String, String> getBasicRequestHeaderMap() {
		// construct from serviceCredential;
		Map<String, String> headers = new HashMap<String, String>();
		if (serviceCredential != null && serviceCredential.getAuthToken() != null) {
			headers.put("Authorization", "Bearer " + serviceCredential.getAuthToken().trim());
		}
		headers.put("Content-Type", "application/json");
		return headers;
	}

	/**
	 * This is one of the most important methods of BusinessService class. 
	 * This method actually makes a REST call to the Experian Service based on the 
	 * given parameters and sets the Service response to rawServiceResponse
	 * @param requestUrl
	 * @param requestBody
	 * @param requestHeaders
	 * @param requestMethod
	 * @throws BISServiceException
	 */
	protected void callService(String requestUrl, String requestBody, Map<String, String> requestHeaders,
			RequestMethod requestMethod) throws BISServiceException {
		URL url = null;
		URLConnection conn = null;
		boolean isHttps = false;
		try {
			isHttps = requestUrl != null && requestUrl.trim().toLowerCase().startsWith("https://");
			url = new URL(requestUrl);
			conn = proxy != null ? url.openConnection(proxy) : url.openConnection();
			conn.setUseCaches(false);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			byte[] postData = requestBody.getBytes(Charset.forName("UTF-8"));
			int postDataLength = postData.length;
			if (requestHeaders != null && requestHeaders.size() > 0) {
				for (String key : requestHeaders.keySet()) {
					conn.setRequestProperty(key, requestHeaders.get(key));
				}
			}
			DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
			wr.write(postData);
			wr.close();
			InputStream is = conn.getInputStream();
			String rawResponse = IOUtils.toString(is);
			setRawServiceResponse(rawResponse);
			is.close();
		} catch (IOException e) {
			String rawResponse;
			if (isHttps && ((HttpsURLConnection) conn).getErrorStream() != null) {
				InputStream is = ((HttpsURLConnection) conn).getErrorStream();
				try {
					rawResponse = IOUtils.toString(is);
				} catch (IOException e1) {
					rawResponse = "";
				} finally {
					if (is != null)
						try {
							is.close();
						} catch (Exception ex) {
							/* silent; */ }
				}
				setRawServiceResponse(rawResponse);
				BISServiceException ex = createServiceException(rawResponse, conn, isHttps, e);
				throw ex;
			} else if (!isHttps && ((HttpURLConnection) conn).getErrorStream() != null) {
				InputStream is = ((HttpURLConnection) conn).getErrorStream();
				try {
					rawResponse = IOUtils.toString(is);
				} catch (IOException e1) {
					rawResponse = "";
				} finally {
					if (is != null)
						try {
							is.close();
						} catch (Exception ex) {
							/* silent; */ }
				}
				setRawServiceResponse(rawResponse);
				BISServiceException ex = createServiceException(rawResponse, conn, isHttps, e);
				throw ex;
			} else {
				throw new BISServiceException("Failed to connect Experian BIS Service", e);
			}
		} catch (Exception ex) {
			throw new BISServiceException("Failed to retrieve Response from Experian BIS Service", ex);
		}
	}

	/**
	 * This class returns an appropriate Custom Exception for any kind of Service Failure
	 * @param rawResponse
	 * @param conn
	 * @param isHttps
	 * @param e
	 * @return
	 */
	private BISServiceException createServiceException(String rawResponse, URLConnection conn, boolean isHttps,
			Exception e) {
		BISServiceException ex = null;
		ObjectMapper mapper = new ObjectMapper();
		if (StringUtils.isNotBlank(rawResponse)) {
			try {
				int responseCode = isHttps ? ((HttpsURLConnection) conn).getResponseCode()
						: ((HttpURLConnection) conn).getResponseCode();
				BISErrorResult errorResult = new BISErrorResult();

				if (responseCode == 400) {
					errorResult = mapper.readValue(rawResponse, BISErrorResult.class);
					ex = new BISValidationException("A validation error has occured", e, errorResult);
				} else if (responseCode == 500 || responseCode == 501 || responseCode == 502 || responseCode == 503) {
					errorResult = mapper.readValue(rawResponse, BISErrorResult.class);
					ex = new BISServiceException("A Service error has occured", e, errorResult);
				} else if (responseCode == 404) {
					ex = new BISServiceException("Requested BIS Service was not found or invalid", e);
				} else if (responseCode == 401 || responseCode == 402 || responseCode == 403) {
					ex = new BISValidationException("A Service Authorization error has occured", e);
				} else {
					ex = new BISServiceException("Failed to connect Experian BIS Service", e);
				}
			} catch (Exception ex2) {
				ex = new BISServiceException("Failed to connect Experian BIS Service", e);
			}
		}
		return ex;
	}

	/**
	 * Converts the JSON formatted response stored in rawServiceResponse to 
	 * the Java object of the Class, passed as parameter of this method 
	 * @param type
	 * @return
	 * @throws BISServiceException
	 */
	protected Object parseResponseToObject(Class type) throws BISServiceException {
		Object obj = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			obj = type.cast(mapper.readValue(getRawServiceResponse(), type));
		} catch (Exception e) {
			throw new BISServiceException("Failed to initialize Response Object", e);
		}
		return obj;
	}

	public abstract BusinessServiceResponse execute(BusinessServiceRequest businessServiceRequest)
			throws BISServiceException;

	public abstract String getServiceId();
}
