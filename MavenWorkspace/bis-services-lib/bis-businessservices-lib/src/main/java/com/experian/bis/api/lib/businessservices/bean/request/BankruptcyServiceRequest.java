package com.experian.bis.api.lib.businessservices.bean.request;

public class BankruptcyServiceRequest extends BusinessServiceRequest {
	private boolean bankruptcySummary;
	private boolean bankruptcyDetail;
	
	public boolean isBankruptcySummary() {
		return bankruptcySummary;
	}
	public void setBankruptcySummary(boolean bankruptcySummary) {
		this.bankruptcySummary = bankruptcySummary;
	}
	public boolean isBankruptcyDetail() {
		return bankruptcyDetail;
	}
	public void setBankruptcyDetail(boolean bankruptcyDetail) {
		this.bankruptcyDetail = bankruptcyDetail;
	}
	
	
}
