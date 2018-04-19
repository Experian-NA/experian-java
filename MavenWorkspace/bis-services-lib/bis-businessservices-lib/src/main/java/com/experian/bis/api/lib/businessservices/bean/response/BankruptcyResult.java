package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class BankruptcyResult {
	private BusinessHeaderResult businessHeader;
	private BankruptcySummaryResult bankruptcySummary;
	private List<BakruptcyDetailResult> bankruptcyDetail;
	private boolean bankruptcyIndicator;
	
	public boolean isBankruptcyIndicator() {
		return bankruptcyIndicator;
	}

	public void setBankruptcyIndicator(boolean bankruptcyIndicator) {
		this.bankruptcyIndicator = bankruptcyIndicator;
	}

	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}

	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}

	public BankruptcySummaryResult getBankruptcySummary() {
		return bankruptcySummary;
	}

	public void setBankruptcySummary(BankruptcySummaryResult bankruptcySummary) {
		this.bankruptcySummary = bankruptcySummary;
	}

	public List<BakruptcyDetailResult> getBankruptcyDetail() {
		return bankruptcyDetail;
	}

	public void setBankruptcyDetail(List<BakruptcyDetailResult> bankruptcyDetail) {
		this.bankruptcyDetail = bankruptcyDetail;
	}
}