package com.experian.bis.api.lib.businessservices.bean.response;

import java.io.Serializable;

public class BusinessServiceResponse implements Serializable {
	private String requestId;
	private boolean success;
	private String comments;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	

}
