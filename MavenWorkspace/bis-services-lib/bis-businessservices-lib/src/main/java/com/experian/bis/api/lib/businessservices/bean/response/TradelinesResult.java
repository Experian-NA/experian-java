package com.experian.bis.api.lib.businessservices.bean.response;

public class TradelinesResult {

	private int tradelineCount;
	private int currentDbt;
	private TotalHighCreditAmountResult totalHighCreditAmount;
	private TotalAccountBalanceResult totalAccountBalance;
	private int currentPercentage;
	private int dbt30;
	private int dbt60;
	private int dbt90;
	private int dbt91Plus;
	public int getTradelineCount() {
		return tradelineCount;
	}
	public void setTradelineCount(int tradelineCount) {
		this.tradelineCount = tradelineCount;
	}
	public int getCurrentDbt() {
		return currentDbt;
	}
	public void setCurrentDbt(int currentDbt) {
		this.currentDbt = currentDbt;
	}
	public TotalHighCreditAmountResult getTotalHighCreditAmount() {
		return totalHighCreditAmount;
	}
	public void setTotalHighCreditAmount(TotalHighCreditAmountResult totalHighCreditAmount) {
		this.totalHighCreditAmount = totalHighCreditAmount;
	}
	public TotalAccountBalanceResult getTotalAccountBalance() {
		return totalAccountBalance;
	}
	public void setTotalAccountBalance(TotalAccountBalanceResult totalAccountBalance) {
		this.totalAccountBalance = totalAccountBalance;
	}
	public int getCurrentPercentage() {
		return currentPercentage;
	}
	public void setCurrentPercentage(int currentPercentage) {
		this.currentPercentage = currentPercentage;
	}
	public int getDbt30() {
		return dbt30;
	}
	public void setDbt30(int dbt30) {
		this.dbt30 = dbt30;
	}
	public int getDbt60() {
		return dbt60;
	}
	public void setDbt60(int dbt60) {
		this.dbt60 = dbt60;
	}
	public int getDbt90() {
		return dbt90;
	}
	public void setDbt90(int dbt90) {
		this.dbt90 = dbt90;
	}
	public int getDbt91Plus() {
		return dbt91Plus;
	}
	public void setDbt91Plus(int dbt91Plus) {
		this.dbt91Plus = dbt91Plus;
	}
	
	
}
