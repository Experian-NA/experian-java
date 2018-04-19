package com.experian.bis.api.lib.businessservices.bean.response;

public class RiskDashboardsServiceResponse extends BusinessServiceResponse{

	private RiskDashboardsResult results;

	public RiskDashboardsResult getResults() {
		return results;
	}

	public void setResults(RiskDashboardsResult results) {
		this.results = results;
	}
	
}
