package com.experian.bis.api.lib.businessservices.bean.response;

public class RiskDashboardsResult {
	
	private BusinessHeaderResult businessHeader;
	private int commercialScore;
	private String commercialScoreRiskClass;
	private int fsrScore;
	private String fsrScoreRiskClass;
	private int recommendedCreditLimitAmount;
	private int currentDbt;
	private int derogatoryLegalCount;
	private int commercialFraudRiskIndicatorCount;
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public int getCommercialScore() {
		return commercialScore;
	}
	public void setCommercialScore(int commercialScore) {
		this.commercialScore = commercialScore;
	}
	public String getCommercialScoreRiskClass() {
		return commercialScoreRiskClass;
	}
	public void setCommercialScoreRiskClass(String commercialScoreRiskClass) {
		this.commercialScoreRiskClass = commercialScoreRiskClass;
	}
	public int getFsrScore() {
		return fsrScore;
	}
	public void setFsrScore(int fsrScore) {
		this.fsrScore = fsrScore;
	}
	public String getFsrScoreRiskClass() {
		return fsrScoreRiskClass;
	}
	public void setFsrScoreRiskClass(String fsrScoreRiskClass) {
		this.fsrScoreRiskClass = fsrScoreRiskClass;
	}
	public int getRecommendedCreditLimitAmount() {
		return recommendedCreditLimitAmount;
	}
	public void setRecommendedCreditLimitAmount(int recommendedCreditLimitAmount) {
		this.recommendedCreditLimitAmount = recommendedCreditLimitAmount;
	}
	public int getCurrentDbt() {
		return currentDbt;
	}
	public void setCurrentDbt(int currentDbt) {
		this.currentDbt = currentDbt;
	}
	public int getDerogatoryLegalCount() {
		return derogatoryLegalCount;
	}
	public void setDerogatoryLegalCount(int derogatoryLegalCount) {
		this.derogatoryLegalCount = derogatoryLegalCount;
	}
	public int getCommercialFraudRiskIndicatorCount() {
		return commercialFraudRiskIndicatorCount;
	}
	public void setCommercialFraudRiskIndicatorCount(int commercialFraudRiskIndicatorCount) {
		this.commercialFraudRiskIndicatorCount = commercialFraudRiskIndicatorCount;
	}
	
	
}
