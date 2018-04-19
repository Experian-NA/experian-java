package com.experian.bis.api.lib.businessservices.bean.response;

public class ScoresSearchServiceResponse extends BusinessServiceResponse{

	private ScoresSearchResult results;

	public ScoresSearchResult getResults() {
		return results;
	}

	public void setResults(ScoresSearchResult results) {
		this.results = results;
	}
}
