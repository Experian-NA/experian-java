package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class SearchServiceResponse extends BusinessServiceResponse {

	private List<SearchResult> results;

	public List<SearchResult> getResults() {
		return results;
	}

	public void setResults(List<SearchResult> results) {
		this.results = results;
	}
	
	
}
