package com.experian.bis.api.lib.common;

public enum RequestMethod {
	POST("post"), GET("get"), HEAD("head");

	private String id;

	RequestMethod(String id) {
		this.id = id;
	}

	public String id() {
		return id;
	}
}
