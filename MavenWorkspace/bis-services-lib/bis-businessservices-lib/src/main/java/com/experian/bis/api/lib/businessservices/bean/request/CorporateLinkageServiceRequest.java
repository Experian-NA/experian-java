package com.experian.bis.api.lib.businessservices.bean.request;

public class CorporateLinkageServiceRequest extends BusinessServiceRequest{

	private String modelCode;
	private boolean corporateLinkagePartial;
	private boolean corporateLinkageFull;
	
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public boolean isCorporateLinkagePartial() {
		return corporateLinkagePartial;
	}
	public void setCorporateLinkagePartial(boolean corporateLinkagePartial) {
		this.corporateLinkagePartial = corporateLinkagePartial;
	}
	public boolean isCorporateLinkageFull() {
		return corporateLinkageFull;
	}
	public void setCorporateLinkageFull(boolean corporateLinkageFull) {
		this.corporateLinkageFull = corporateLinkageFull;
	}
	
	
}
