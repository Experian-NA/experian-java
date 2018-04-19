package com.experian.bis.api.lib.businessservices.bean.response;

public class CommercialScoreResult {

	private String modelCode;
	private String modelTitle;
	private String customModelCode;
	private int score;
	private int percentileRanking;
	private int recommendedCreditLimitAmount;
	private RiskClassResult  riskClass;
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getModelTitle() {
		return modelTitle;
	}
	public void setModelTitle(String modelTitle) {
		this.modelTitle = modelTitle;
	}
	public String getCustomModelCode() {
		return customModelCode;
	}
	public void setCustomModelCode(String customModelCode) {
		this.customModelCode = customModelCode;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getPercentileRanking() {
		return percentileRanking;
	}
	public void setPercentileRanking(int percentileRanking) {
		this.percentileRanking = percentileRanking;
	}
	
	public int getRecommendedCreditLimitAmount() {
		return recommendedCreditLimitAmount;
	}
	public void setRecommendedCreditLimitAmount(int recommendedCreditLimitAmount) {
		this.recommendedCreditLimitAmount = recommendedCreditLimitAmount;
	}
	public RiskClassResult getRiskClass() {
		return riskClass;
	}
	public void setRiskClass(RiskClassResult riskClass) {
		this.riskClass = riskClass;
	}
}
