package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class BankruptcyServiceResponse extends BusinessServiceResponse {
	private BankruptcyResult results;

	public BankruptcyResult getResults() {
		return results;
	}

	public void setResults(BankruptcyResult results) {
		this.results = results;
	}

}
