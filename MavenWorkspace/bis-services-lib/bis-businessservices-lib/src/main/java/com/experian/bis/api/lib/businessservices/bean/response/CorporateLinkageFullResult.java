package com.experian.bis.api.lib.businessservices.bean.response;

public class CorporateLinkageFullResult extends CorporateLinkagePartialResult {

	private String ultimateBin;
	private String parentBin;
	private boolean ultimateParentIndicator;
	private boolean parentIndicator;
	private boolean subsidiaryIndicator;
	private int linkageLevel;
	private boolean branchIndicator;
	private boolean activityIndicator;
	private String commercialRiskClass;
	public String getUltimateBin() {
		return ultimateBin;
	}
	public void setUltimateBin(String ultimateBin) {
		this.ultimateBin = ultimateBin;
	}
	public String getParentBin() {
		return parentBin;
	}
	public void setParentBin(String parentBin) {
		this.parentBin = parentBin;
	}
	public boolean isUltimateParentIndicator() {
		return ultimateParentIndicator;
	}
	public void setUltimateParentIndicator(boolean ultimateParentIndicator) {
		this.ultimateParentIndicator = ultimateParentIndicator;
	}
	public boolean isParentIndicator() {
		return parentIndicator;
	}
	public void setParentIndicator(boolean parentIndicator) {
		this.parentIndicator = parentIndicator;
	}
	public boolean isSubsidiaryIndicator() {
		return subsidiaryIndicator;
	}
	public void setSubsidiaryIndicator(boolean subsidiaryIndicator) {
		this.subsidiaryIndicator = subsidiaryIndicator;
	}
	public int getLinkageLevel() {
		return linkageLevel;
	}
	public void setLinkageLevel(int linkageLevel) {
		this.linkageLevel = linkageLevel;
	}
	public boolean isBranchIndicator() {
		return branchIndicator;
	}
	public void setBranchIndicator(boolean branchIndicator) {
		this.branchIndicator = branchIndicator;
	}
	public boolean isActivityIndicator() {
		return activityIndicator;
	}
	public void setActivityIndicator(boolean activityIndicator) {
		this.activityIndicator = activityIndicator;
	}
	public String getCommercialRiskClass() {
		return commercialRiskClass;
	}
	public void setCommercialRiskClass(String commercialRiskClass) {
		this.commercialRiskClass = commercialRiskClass;
	}
	
	
	
	
}
