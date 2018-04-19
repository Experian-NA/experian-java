package com.experian.bis.api.lib.businessservices.test;

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

	protected synchronized BISServiceCredential getServiceCredential() {
		if (SERVICE_CREDENTIAL == null) {
			System.out.println("Invoking One Time Authentication Service to get Auth Token...");
			try {
				BISAuthenticationService authService = new BISAuthenticationService();
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
