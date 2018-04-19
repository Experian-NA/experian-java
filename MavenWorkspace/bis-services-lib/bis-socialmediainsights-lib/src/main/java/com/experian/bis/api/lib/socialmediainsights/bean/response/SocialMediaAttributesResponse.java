package com.experian.bis.api.lib.socialmediainsights.bean.response;

public class SocialMediaAttributesResponse {
	private SocialMediaAttributesResult results;
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

	public SocialMediaAttributesResult getResults() {
		return results;
	}

	public void setResults(SocialMediaAttributesResult results) {
		this.results = results;
	}

}
