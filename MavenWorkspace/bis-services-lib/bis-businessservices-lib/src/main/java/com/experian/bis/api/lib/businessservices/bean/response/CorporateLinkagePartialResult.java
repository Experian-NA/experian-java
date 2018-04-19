package com.experian.bis.api.lib.businessservices.bean.response;

public class CorporateLinkagePartialResult {
	
	private String corporateLinkageType;
	private String bin;
	private String businessName;
	private AddressCorporateLinkageResult address;
	private boolean matchingBusinessIndicator;
	private boolean returnLimitExceeded;
	public String getCorporateLinkageType() {
		return corporateLinkageType;
	}
	public void setCorporateLinkageType(String corporateLinkageType) {
		this.corporateLinkageType = corporateLinkageType;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public AddressCorporateLinkageResult getAddress() {
		return address;
	}
	public void setAddress(AddressCorporateLinkageResult address) {
		this.address = address;
	}
	public boolean isMatchingBusinessIndicator() {
		return matchingBusinessIndicator;
	}
	public void setMatchingBusinessIndicator(boolean matchingBusinessIndicator) {
		this.matchingBusinessIndicator = matchingBusinessIndicator;
	}
	public boolean isReturnLimitExceeded() {
		return returnLimitExceeded;
	}
	public void setReturnLimitExceeded(boolean returnLimitExceeded) {
		this.returnLimitExceeded = returnLimitExceeded;
	}
	
	

}
