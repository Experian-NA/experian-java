package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class UCCFilingsSummaryResult {

	private int uccFilingsCount;
	private List <UCCFilingsTrendsResult> uccFilingsTrends;
	public int getUccFilingsCount() {
		return uccFilingsCount;
	}
	public void setUccFilingsCount(int uccFilingsCount) {
		this.uccFilingsCount = uccFilingsCount;
	}
	public List<UCCFilingsTrendsResult> getUccFilingsTrends() {
		return uccFilingsTrends;
	}
	public void setUccFilingsTrends(List<UCCFilingsTrendsResult> uccFilingsTrends) {
		this.uccFilingsTrends = uccFilingsTrends;
	}
	
	
}
