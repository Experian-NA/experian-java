package com.experian.bis.api.lib.common;

public class BISValidationException extends BISServiceException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 675833009344318258L;

	public BISValidationException(String message) {
		super(message);
	}
	
	public BISValidationException(String message, Exception ex) {
		super(message,ex);
	}
	
	public BISValidationException(Exception ex) {
		super(ex);
	}
	
	public BISValidationException(String message, BISErrorResult serviceError) {
		super(message,serviceError);
	}

	public BISValidationException(String message, Exception ex, BISErrorResult serviceError) {
		super(message,ex, serviceError);
	}
	
	public BISValidationException(Exception ex, BISErrorResult serviceError) {
		super(ex,serviceError);
	}
	
}
