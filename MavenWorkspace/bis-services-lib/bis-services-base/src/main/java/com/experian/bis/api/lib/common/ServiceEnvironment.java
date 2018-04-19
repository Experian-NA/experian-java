package com.experian.bis.api.lib.common;

public enum ServiceEnvironment {
	PRODUCTION("prod"), STAGE("stage");

	private String id;

	ServiceEnvironment(String id) {
		this.id = id;
	}

	public String id() {
		return id;
	}
}
