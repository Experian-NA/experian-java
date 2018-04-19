package com.experian.bis.api.lib.businessservices.bean.response;

public class TradesResult {

	private BusinessHeaderResult businessHeader;
	private TradePaymentSummaryResult tradePaymentSummary;
	private TradePaymentTotalsResult tradePaymentTotals;
	private TradePaymentExperiencesResult tradePaymentExperiences;
	private TradePaymentTrendsResult tradePaymentTrends;
	private boolean tradeIndicator;
	
	
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public TradePaymentSummaryResult getTradePaymentSummary() {
		return tradePaymentSummary;
	}
	public void setTradePaymentSummary(TradePaymentSummaryResult tradePaymentSummary) {
		this.tradePaymentSummary = tradePaymentSummary;
	}
	public TradePaymentTotalsResult getTradePaymentTotals() {
		return tradePaymentTotals;
	}
	public void setTradePaymentTotals(TradePaymentTotalsResult tradePaymentTotals) {
		this.tradePaymentTotals = tradePaymentTotals;
	}
	public TradePaymentExperiencesResult getTradePaymentExperiences() {
		return tradePaymentExperiences;
	}
	public void setTradePaymentExperiences(TradePaymentExperiencesResult tradePaymentExperiences) {
		this.tradePaymentExperiences = tradePaymentExperiences;
	}
	public TradePaymentTrendsResult getTradePaymentTrends() {
		return tradePaymentTrends;
	}
	public void setTradePaymentTrends(TradePaymentTrendsResult tradePaymentTrends) {
		this.tradePaymentTrends = tradePaymentTrends;
	}
	public boolean isTradeIndicator() {
		return tradeIndicator;
	}
	public void setTradeIndicator(boolean tradeIndicator) {
		this.tradeIndicator = tradeIndicator;
	}
	
	
}
