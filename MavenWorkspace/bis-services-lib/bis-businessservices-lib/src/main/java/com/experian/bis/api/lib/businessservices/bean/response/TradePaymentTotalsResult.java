package com.experian.bis.api.lib.businessservices.bean.response;

public class TradePaymentTotalsResult {

	private TradelinesResult tradelines;
	private NewlyReportedTradelinesResult newlyReportedTradelines;
	private ContinuouslyReportedTradelinesResult continuouslyReportedTradelines;
	private CombinedTradelinesResult combinedTradelines;
	private AdditionalTradelinesResult additionalTradelines;
	
	
	public TradelinesResult getTradelines() {
		return tradelines;
	}
	public void setTradelines(TradelinesResult tradelines) {
		this.tradelines = tradelines;
	}
	public NewlyReportedTradelinesResult getNewlyReportedTradelines() {
		return newlyReportedTradelines;
	}
	public void setNewlyReportedTradelines(NewlyReportedTradelinesResult newlyReportedTradelines) {
		this.newlyReportedTradelines = newlyReportedTradelines;
	}
	public ContinuouslyReportedTradelinesResult getContinuouslyReportedTradelines() {
		return continuouslyReportedTradelines;
	}
	public void setContinuouslyReportedTradelines(ContinuouslyReportedTradelinesResult continuouslyReportedTradelines) {
		this.continuouslyReportedTradelines = continuouslyReportedTradelines;
	}
	public CombinedTradelinesResult getCombinedTradelines() {
		return combinedTradelines;
	}
	public void setCombinedTradelines(CombinedTradelinesResult combinedTradelines) {
		this.combinedTradelines = combinedTradelines;
	}
	public AdditionalTradelinesResult getAdditionalTradelines() {
		return additionalTradelines;
	}
	public void setAdditionalTradelines(AdditionalTradelinesResult additionalTradelines) {
		this.additionalTradelines = additionalTradelines;
	}
	
	
}
