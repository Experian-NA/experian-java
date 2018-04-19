package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class CorporateLinkageResult {

	private BusinessHeaderResult businessHeader;
	private List<CorporateLinkagePartialResult> corporateLinkagePartial;
	private List<CorporateLinkageFullResult> corporateLinkageFull;
	private boolean corporateLinkageIndicator;
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public List<CorporateLinkagePartialResult> getCorporateLinkagePartial() {
		return corporateLinkagePartial;
	}
	public void setCorporateLinkagePartial(List<CorporateLinkagePartialResult> corporateLinkagePartial) {
		this.corporateLinkagePartial = corporateLinkagePartial;
	}
	public List<CorporateLinkageFullResult> getCorporateLinkageFull() {
		return corporateLinkageFull;
	}
	public void setCorporateLinkageFull(List<CorporateLinkageFullResult> corporateLinkageFull) {
		this.corporateLinkageFull = corporateLinkageFull;
	}
	public boolean isCorporateLinkageIndicator() {
		return corporateLinkageIndicator;
	}
	public void setCorporateLinkageIndicator(boolean corporateLinkageIndicator) {
		this.corporateLinkageIndicator = corporateLinkageIndicator;
	}
	
	
}
