package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class BusinessHeaderResult {
	private String bin;
	private String businessName;
	private AddressResult address;
	private String phone;
	private String taxId;
	private String websiteUrl;
	private String legalBusinessName;
	private List<String> dbaNames;
	private boolean customerDisputeIndicator;

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

	public AddressResult getAddress() {
		return address;
	}

	public void setAddress(AddressResult address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getLegalBusinessName() {
		return legalBusinessName;
	}

	public void setLegalBusinessName(String legalBusinessName) {
		this.legalBusinessName = legalBusinessName;
	}

	public List<String> getDbaNames() {
		return dbaNames;
	}

	public void setDbaNames(List<String> dbaNames) {
		this.dbaNames = dbaNames;
	}

	public boolean isCustomerDisputeIndicator() {
		return customerDisputeIndicator;
	}

	public void setCustomerDisputeIndicator(boolean customerDisputeIndicator) {
		this.customerDisputeIndicator = customerDisputeIndicator;
	}

}
