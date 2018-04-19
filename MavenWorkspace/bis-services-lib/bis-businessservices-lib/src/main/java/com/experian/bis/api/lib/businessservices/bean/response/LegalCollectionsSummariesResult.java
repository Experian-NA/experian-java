package com.experian.bis.api.lib.businessservices.bean.response;

public class LegalCollectionsSummariesResult {

	private BusinessHeaderResult businessHeader;
	private LegalFilingsSummaryResult legalFilingsSummary; 
	private LegalFilingsCollectionsSummaryResult legalFilingsCollectionsSummary;
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public LegalFilingsSummaryResult getLegalFilingsSummary() {
		return legalFilingsSummary;
	}
	public void setLegalFilingsSummary(LegalFilingsSummaryResult legalFilingsSummary) {
		this.legalFilingsSummary = legalFilingsSummary;
	}
	public LegalFilingsCollectionsSummaryResult getLegalFilingsCollectionsSummary() {
		return legalFilingsCollectionsSummary;
	}
	public void setLegalFilingsCollectionsSummary(LegalFilingsCollectionsSummaryResult legalFilingsCollectionsSummary) {
		this.legalFilingsCollectionsSummary = legalFilingsCollectionsSummary;
	}
	
	
}
