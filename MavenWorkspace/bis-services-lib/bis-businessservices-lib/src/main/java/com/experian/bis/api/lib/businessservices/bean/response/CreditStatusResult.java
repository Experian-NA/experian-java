package com.experian.bis.api.lib.businessservices.bean.response;

public class CreditStatusResult {

	private BusinessHeaderResult businessHeader;
	private int combinedTradelineCount;
	private int combinedAccountBalance;
	private int currentDbt;
	private int combinedRecentHighCreditAmount;
	private int yearsOnFile;
	private int inquiryCount;
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public int getCombinedTradelineCount() {
		return combinedTradelineCount;
	}
	public void setCombinedTradelineCount(int combinedTradelineCount) {
		this.combinedTradelineCount = combinedTradelineCount;
	}
	public int getCombinedAccountBalance() {
		return combinedAccountBalance;
	}
	public void setCombinedAccountBalance(int combinedAccountBalance) {
		this.combinedAccountBalance = combinedAccountBalance;
	}
	public int getCurrentDbt() {
		return currentDbt;
	}
	public void setCurrentDbt(int currentDbt) {
		this.currentDbt = currentDbt;
	}
	public int getCombinedRecentHighCreditAmount() {
		return combinedRecentHighCreditAmount;
	}
	public void setCombinedRecentHighCreditAmount(int combinedRecentHighCreditAmount) {
		this.combinedRecentHighCreditAmount = combinedRecentHighCreditAmount;
	}
	public int getYearsOnFile() {
		return yearsOnFile;
	}
	public void setYearsOnFile(int yearsOnFile) {
		this.yearsOnFile = yearsOnFile;
	}
	public int getInquiryCount() {
		return inquiryCount;
	}
	public void setInquiryCount(int inquiryCount) {
		this.inquiryCount = inquiryCount;
	}
	
	
}
