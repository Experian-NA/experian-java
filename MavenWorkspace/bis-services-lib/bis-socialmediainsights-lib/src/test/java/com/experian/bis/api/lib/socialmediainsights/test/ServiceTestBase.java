package com.experian.bis.api.lib.socialmediainsights.test;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ResourceBundle;

import org.junit.Assert;

import com.experian.bis.api.lib.common.BISServiceCredential;
import com.experian.bis.api.lib.common.service.BISAuthenticationService;

public class ServiceTestBase {
	public static BISServiceCredential SERVICE_CREDENTIAL = null;
	private ResourceBundle rBundle = null;

	{
		rBundle = ResourceBundle.getBundle("test-config");
	}

	protected Proxy getProxy() {
		Proxy proxy = null;
		if (rBundle.getString("useProxy") != null && rBundle.getString("useProxy").toLowerCase().equals("true")) {
			proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("mckcache.mck.experian.com", 9090));
		}
		return proxy;
	}

	protected synchronized BISServiceCredential getServiceCredential() {
		if (SERVICE_CREDENTIAL == null) {
			System.out.println("Invoking One Time Authentication Service to get Auth Token...");
			try {
				BISAuthenticationService authService = new BISAuthenticationService(getProxy());
				SERVICE_CREDENTIAL = authService.getStageServiceCredential(rBundle.getString("username"),
						rBundle.getString("password"), rBundle.getString("client_id"),
						rBundle.getString("client_secret"));
			} catch (Exception ex) {
				ex.printStackTrace();
				Assert.fail("Authentication Service Test Failed");
			}
		}
		return SERVICE_CREDENTIAL;
	}
}
