package com.experian.bis.api.lib.businessservices.bean.response;

public class BusinessContactsServiceResponse extends BusinessServiceResponse{
	private BusinessContactsResult results;

	public BusinessContactsResult getResults() {
		return results;
	}

	public void setResults(BusinessContactsResult results) {
		this.results = results;
	}
	
}