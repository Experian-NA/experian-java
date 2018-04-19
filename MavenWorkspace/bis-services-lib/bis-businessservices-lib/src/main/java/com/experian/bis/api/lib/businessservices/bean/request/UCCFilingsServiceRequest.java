package com.experian.bis.api.lib.businessservices.bean.request;

public class UCCFilingsServiceRequest extends BusinessServiceRequest{

	private boolean uccFilingsSummary;
	private boolean uccFilingsDetail;
	
	public boolean isUccFilingsSummary() {
		return uccFilingsSummary;
	}
	public void setUccFilingsSummary(boolean uccFilingsSummary) {
		this.uccFilingsSummary = uccFilingsSummary;
	}
	public boolean isUccFilingsDetail() {
		return uccFilingsDetail;
	}
	public void setUccFilingsDetail(boolean uccFilingsDetail) {
		this.uccFilingsDetail = uccFilingsDetail;
	}
	
	
}
