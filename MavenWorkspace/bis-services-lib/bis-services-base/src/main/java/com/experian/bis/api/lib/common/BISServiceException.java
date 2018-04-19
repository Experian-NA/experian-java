package com.experian.bis.api.lib.common;

public class BISServiceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1982347L;
	private BISErrorResult serviceError;

	public BISServiceException(String message) {
		super(message);
	}

	public BISServiceException(String message, Exception ex) {
		super(message, ex);
	}

	public BISServiceException(Exception ex) {
		super(ex);
	}

	public BISServiceException(String message, BISErrorResult serviceError) {
		super(message);
		this.serviceError = serviceError;
	}

	public BISServiceException(String message, Exception ex, BISErrorResult serviceError) {
		super(message, ex);
		this.serviceError = serviceError;
	}

	public BISServiceException(Exception ex, BISErrorResult serviceError) {
		super(ex);
		this.serviceError = serviceError;
	}

	public BISErrorResult getServiceError() {
		return serviceError;
	}

	public void setServiceError(BISErrorResult serviceError) {
		this.serviceError = serviceError;
	}

}
