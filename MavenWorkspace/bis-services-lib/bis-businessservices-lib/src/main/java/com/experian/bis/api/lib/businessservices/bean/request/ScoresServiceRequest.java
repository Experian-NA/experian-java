package com.experian.bis.api.lib.businessservices.bean.request;

public class ScoresServiceRequest extends BusinessServiceRequest {

	private String modelCode;
	private boolean commercialScore;
	private boolean fsrScore;
	
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public boolean isCommercialScore() {
		return commercialScore;
	}
	public void setCommercialScore(boolean commercialScore) {
		this.commercialScore = commercialScore;
	}
	public boolean isFsrScore() {
		return fsrScore;
	}
	public void setFsrScore(boolean fsrScore) {
		this.fsrScore = fsrScore;
	}
	
	
}
