package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class UCCFilingsResult {

	private BusinessHeaderResult businessHeader;
	private UCCFilingsSummaryResult uccFilingsSummary;
	private List <UCCFilingsDetailResult> uccFilingsDetail;
	private boolean uccFilingIndicator;
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public UCCFilingsSummaryResult getUccFilingsSummary() {
		return uccFilingsSummary;
	}
	public void setUccFilingsSummary(UCCFilingsSummaryResult uccFilingsSummary) {
		this.uccFilingsSummary = uccFilingsSummary;
	}
	public List<UCCFilingsDetailResult> getUccFilingsDetail() {
		return uccFilingsDetail;
	}
	public void setUccFilingsDetail(List<UCCFilingsDetailResult> uccFilingsDetail) {
		this.uccFilingsDetail = uccFilingsDetail;
	}
	public boolean isUccFilingIndicator() {
		return uccFilingIndicator;
	}
	public void setUccFilingIndicator(boolean uccFilingIndicator) {
		this.uccFilingIndicator = uccFilingIndicator;
	}
	
	
} 
