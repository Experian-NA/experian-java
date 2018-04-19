package com.experian.bis.api.lib.common;

public class BISError {
	private String code;
	private String message;
	private String param;
	
	public BISError() {
		
	}
	
	public BISError(String message, String code, String param) {
		this.code = code;
		this.message = message;
		this.param = param;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	
}
