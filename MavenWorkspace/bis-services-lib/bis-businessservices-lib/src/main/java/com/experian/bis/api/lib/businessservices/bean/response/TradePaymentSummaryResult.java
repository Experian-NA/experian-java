package com.experian.bis.api.lib.businessservices.bean.response;

public class TradePaymentSummaryResult {

	private int currentDbt;
	private int monthlyAverageDbt;
	private int highestDbt6Months;
	private int highestDbt5Quarters;
	private int allTradelineCount;
	private int allTradelineBalance;
	private int currentTradelineCount;
	private int currentAccountBalance;
	private int medianCreditAmountExtended;
	private int singleHighCredit;
	public int getCurrentDbt() {
		return currentDbt;
	}
	public void setCurrentDbt(int currentDbt) {
		this.currentDbt = currentDbt;
	}
	public int getMonthlyAverageDbt() {
		return monthlyAverageDbt;
	}
	public void setMonthlyAverageDbt(int monthlyAverageDbt) {
		this.monthlyAverageDbt = monthlyAverageDbt;
	}
	public int getHighestDbt6Months() {
		return highestDbt6Months;
	}
	public void setHighestDbt6Months(int highestDbt6Months) {
		this.highestDbt6Months = highestDbt6Months;
	}
	public int getHighestDbt5Quarters() {
		return highestDbt5Quarters;
	}
	public void setHighestDbt5Quarters(int highestDbt5Quarters) {
		this.highestDbt5Quarters = highestDbt5Quarters;
	}
	public int getAllTradelineCount() {
		return allTradelineCount;
	}
	public void setAllTradelineCount(int allTradelineCount) {
		this.allTradelineCount = allTradelineCount;
	}
	public int getAllTradelineBalance() {
		return allTradelineBalance;
	}
	public void setAllTradelineBalance(int allTradelineBalance) {
		this.allTradelineBalance = allTradelineBalance;
	}
	public int getCurrentTradelineCount() {
		return currentTradelineCount;
	}
	public void setCurrentTradelineCount(int currentTradelineCount) {
		this.currentTradelineCount = currentTradelineCount;
	}
	public int getCurrentAccountBalance() {
		return currentAccountBalance;
	}
	public void setCurrentAccountBalance(int currentAccountBalance) {
		this.currentAccountBalance = currentAccountBalance;
	}
	public int getMedianCreditAmountExtended() {
		return medianCreditAmountExtended;
	}
	public void setMedianCreditAmountExtended(int medianCreditAmountExtended) {
		this.medianCreditAmountExtended = medianCreditAmountExtended;
	}
	public int getSingleHighCredit() {
		return singleHighCredit;
	}
	public void setSingleHighCredit(int singleHighCredit) {
		this.singleHighCredit = singleHighCredit;
	}
	
	
}
