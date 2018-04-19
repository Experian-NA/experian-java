package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class LiensResult {
	private BusinessHeaderResult businessHeader;
	private LienSummaryResult lienSummary;
	private List <LienDetailResult> lienDetail;
	private boolean lienIndicator;
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public LienSummaryResult getLienSummary() {
		return lienSummary;
	}
	public void setLienSummary(LienSummaryResult lienSummary) {
		this.lienSummary = lienSummary;
	}
	public List<LienDetailResult> getLienDetail() {
		return lienDetail;
	}
	public void setLienDetail(List<LienDetailResult> lienDetail) {
		this.lienDetail = lienDetail;
	}
	public boolean isLienIndicator() {
		return lienIndicator;
	}
	public void setLienIndicator(boolean lienIndicator) {
		this.lienIndicator = lienIndicator;
	}
	
	
}
