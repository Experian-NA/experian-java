package com.experian.bis.api.lib.businessservices.bean.response;

public class CompanyOwnersAndPrincipalsResult {

	private String dateReported;
	private boolean currentOwnerIndicator;
	private String businessName;
	private String taxId;
	private TaxIdTypeResult taxIdType;
	private String internetDomain;
	private boolean ownerIsGuarantorIndicator;
	private BusinessContactsAddressResult businessContactsAddress;
	private String phone;
	private int percentOfFinancialObligation;
	private boolean nameAddressChangeIndicator;
	public String getDateReported() {
		return dateReported;
	}
	public void setDateReported(String dateReported) {
		this.dateReported = dateReported;
	}
	public boolean isCurrentOwnerIndicator() {
		return currentOwnerIndicator;
	}
	public void setCurrentOwnerIndicator(boolean currentOwnerIndicator) {
		this.currentOwnerIndicator = currentOwnerIndicator;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public TaxIdTypeResult getTaxIdType() {
		return taxIdType;
	}
	public void setTaxIdType(TaxIdTypeResult taxIdType) {
		this.taxIdType = taxIdType;
	}
	public String getInternetDomain() {
		return internetDomain;
	}
	public void setInternetDomain(String internetDomain) {
		this.internetDomain = internetDomain;
	}
	public boolean isOwnerIsGuarantorIndicator() {
		return ownerIsGuarantorIndicator;
	}
	public void setOwnerIsGuarantorIndicator(boolean ownerIsGuarantorIndicator) {
		this.ownerIsGuarantorIndicator = ownerIsGuarantorIndicator;
	}
	public BusinessContactsAddressResult getBusinessContactsAddress() {
		return businessContactsAddress;
	}
	public void setBusinessContactsAddress(BusinessContactsAddressResult businessContactsAddress) {
		this.businessContactsAddress = businessContactsAddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getPercentOfFinancialObligation() {
		return percentOfFinancialObligation;
	}
	public void setPercentOfFinancialObligation(int percentOfFinancialObligation) {
		this.percentOfFinancialObligation = percentOfFinancialObligation;
	}
	public boolean isNameAddressChangeIndicator() {
		return nameAddressChangeIndicator;
	}
	public void setNameAddressChangeIndicator(boolean nameAddressChangeIndicator) {
		this.nameAddressChangeIndicator = nameAddressChangeIndicator;
	}
	
	
}