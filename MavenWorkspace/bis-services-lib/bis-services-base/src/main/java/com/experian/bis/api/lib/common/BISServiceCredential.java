package com.experian.bis.api.lib.common;

public class BISServiceCredential {
	private ServiceEnvironment environment;
	private String authToken;

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public ServiceEnvironment getEnvironment() {
		return environment;
	}

	public void setEnvironment(ServiceEnvironment environment) {
		this.environment = environment;
	}

}
