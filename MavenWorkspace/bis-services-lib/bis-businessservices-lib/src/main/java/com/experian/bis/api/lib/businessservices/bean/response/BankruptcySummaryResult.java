package com.experian.bis.api.lib.businessservices.bean.response;

public class BankruptcySummaryResult {
	private boolean bankruptcyIndicator;
	private int bankruptcyCount;

	public boolean isBankruptcyIndicator() {
		return bankruptcyIndicator;
	}

	public void setBankruptcyIndicator(boolean bankruptcyIndicator) {
		this.bankruptcyIndicator = bankruptcyIndicator;
	}

	public int getBankruptcyCount() {
		return bankruptcyCount;
	}

	public void setBankruptcyCount(int bankruptcyCount) {
		this.bankruptcyCount = bankruptcyCount;
	}

}
