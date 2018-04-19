package com.experian.bis.api.lib.businessservices.bean.request;

public class LegalCollectionsSummariesServiceRequest extends BusinessServiceRequest {

	private boolean legalFilingsCollectionsSummary;
	private boolean legalFilingsSummary;
	
	public boolean isLegalFilingsCollectionsSummary() {
		return legalFilingsCollectionsSummary;
	}
	public void setLegalFilingsCollectionsSummary(boolean legalFilingsCollectionsSummary) {
		this.legalFilingsCollectionsSummary = legalFilingsCollectionsSummary;
	}
	public boolean isLegalFilingsSummary() {
		return legalFilingsSummary;
	}
	public void setLegalFilingsSummary(boolean legalFilingsSummary) {
		this.legalFilingsSummary = legalFilingsSummary;
	}
	
	
}
