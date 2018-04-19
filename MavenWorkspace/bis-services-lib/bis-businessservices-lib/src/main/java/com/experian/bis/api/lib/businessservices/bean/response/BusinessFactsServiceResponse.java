package com.experian.bis.api.lib.businessservices.bean.response;

public class BusinessFactsServiceResponse extends BusinessServiceResponse{
	private BusinessFactsResult results;

	public BusinessFactsResult getResults() {
		return results;
	}

	public void setResults(BusinessFactsResult results) {
		this.results = results;
	}
	
}