package com.experian.bis.api.lib.businessservices.bean.request;

public class LiensServiceRequest extends BusinessServiceRequest {

	private boolean lienSummary;
	private boolean lienDetail;
	
	public boolean isLienSummary() {
		return lienSummary;
	}
	public void setLienSummary(boolean lienSummary) {
		this.lienSummary = lienSummary;
	}
	public boolean isLienDetail() {
		return lienDetail;
	}
	public void setLienDetail(boolean lienDetail) {
		this.lienDetail = lienDetail;
	}
	
	
}
