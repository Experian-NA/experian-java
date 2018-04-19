package com.experian.bis.api.lib.businessservices.bean.response;

public class LegalFilingsSummaryResult {

	private int legalCount;
	private int legalBalance;
	private int derogatoryLegalCount;
	public int getLegalCount() {
		return legalCount;
	}
	public void setLegalCount(int legalCount) {
		this.legalCount = legalCount;
	}
	public int getLegalBalance() {
		return legalBalance;
	}
	public void setLegalBalance(int legalBalance) {
		this.legalBalance = legalBalance;
	}
	public int getDerogatoryLegalCount() {
		return derogatoryLegalCount;
	}
	public void setDerogatoryLegalCount(int derogatoryLegalCount) {
		this.derogatoryLegalCount = derogatoryLegalCount;
	}
	
	
}
