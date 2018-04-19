package com.experian.bis.api.lib.businessservices.bean.request;

public class TradesServiceRequest extends BusinessServiceRequest{

	private boolean tradePaymentSummary;
	private boolean tradePaymentTotals;
	private boolean tradePaymentExperiences;
	private boolean tradePaymentTrends;
	
	public boolean isTradePaymentSummary() {
		return tradePaymentSummary;
	}
	public void setTradePaymentSummary(boolean tradePaymentSummary) {
		this.tradePaymentSummary = tradePaymentSummary;
	}
	public boolean isTradePaymentTotals() {
		return tradePaymentTotals;
	}
	public void setTradePaymentTotals(boolean tradePaymentTotals) {
		this.tradePaymentTotals = tradePaymentTotals;
	}
	public boolean isTradePaymentExperiences() {
		return tradePaymentExperiences;
	}
	public void setTradePaymentExperiences(boolean tradePaymentExperiences) {
		this.tradePaymentExperiences = tradePaymentExperiences;
	}
	public boolean isTradePaymentTrends() {
		return tradePaymentTrends;
	}
	public void setTradePaymentTrends(boolean tradePaymentTrends) {
		this.tradePaymentTrends = tradePaymentTrends;
	}
	
	
}
