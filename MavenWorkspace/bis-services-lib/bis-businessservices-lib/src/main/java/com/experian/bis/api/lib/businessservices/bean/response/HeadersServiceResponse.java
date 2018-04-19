package com.experian.bis.api.lib.businessservices.bean.response;

public class HeadersServiceResponse extends BusinessServiceResponse{

	private BusinessHeaderResult results;

	public BusinessHeaderResult getResults() {
		return results;
	}

	public void setResults(BusinessHeaderResult results) {
		this.results = results;
	}
	
	
}
