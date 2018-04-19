package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class TradePaymentTrendsResult {

	private List <MonthlyTrendsResult> monthlyTrends;
	private List <QuarterlyTrendsResult> quarterlyTrends;
	public List<MonthlyTrendsResult> getMonthlyTrends() {
		return monthlyTrends;
	}
	public void setMonthlyTrends(List<MonthlyTrendsResult> monthlyTrends) {
		this.monthlyTrends = monthlyTrends;
	}
	public List<QuarterlyTrendsResult> getQuarterlyTrends() {
		return quarterlyTrends;
	}
	public void setQuarterlyTrends(List<QuarterlyTrendsResult> quarterlyTrends) {
		this.quarterlyTrends = quarterlyTrends;
	} 
}
