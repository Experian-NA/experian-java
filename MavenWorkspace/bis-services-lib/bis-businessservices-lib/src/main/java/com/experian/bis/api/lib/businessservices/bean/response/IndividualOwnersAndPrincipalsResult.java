package com.experian.bis.api.lib.businessservices.bean.response;

public class IndividualOwnersAndPrincipalsResult extends AddressResult{

	private String dateReported;
	private boolean currentOwnerIndicator;
	private String firstName;
	private String middleName;
	private String lastName;
	private String generationCode;
	private String emailAddress;
	private boolean ownerIsGuarantorIndicator;
	//private BusinessContactsAddressResult businessContactsAddress;
	private AddressResult addressResult;
	private boolean nameAddressChangeIndicator;
	private int percentOfFinancialObligation;
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGenerationCode() {
		return generationCode;
	}
	public void setGenerationCode(String generationCode) {
		this.generationCode = generationCode;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public boolean isOwnerIsGuarantorIndicator() {
		return ownerIsGuarantorIndicator;
	}
	public void setOwnerIsGuarantorIndicator(boolean ownerIsGuarantorIndicator) {
		this.ownerIsGuarantorIndicator = ownerIsGuarantorIndicator;
	}
	public boolean isNameAddressChangeIndicator() {
		return nameAddressChangeIndicator;
	}
	public void setNameAddressChangeIndicator(boolean nameAddressChangeIndicator) {
		this.nameAddressChangeIndicator = nameAddressChangeIndicator;
	}
	public int getPercentOfFinancialObligation() {
		return percentOfFinancialObligation;
	}
	public void setPercentOfFinancialObligation(int percentOfFinancialObligation) {
		this.percentOfFinancialObligation = percentOfFinancialObligation;
	}
//	public BusinessContactsAddressResult getBusinessContactsAddress() {
//		return businessContactsAddress;
//	}
//	public void setBusinessContactsAddress(BusinessContactsAddressResult businessContactsAddress) {
//		this.businessContactsAddress = businessContactsAddress;
//	}
	public AddressResult getAddressResult() {
		return addressResult;
	}
	public void setAddressResult(AddressResult addressResult) {
		this.addressResult = addressResult;
	}
	
	
	
}
