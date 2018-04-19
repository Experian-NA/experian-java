package com.experian.bis.api.lib.businessservices.bean.response;

public class MatchingNameAndAddress {

	private String businessName;
	private AddressResult address;
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public AddressResult getAddress() {
		return address;
	}
	public void setAddress(AddressResult address) {
		this.address = address;
	}
	
	
}
