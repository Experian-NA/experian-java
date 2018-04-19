package com.experian.bis.api.lib.businessservices.bean.response;

public class SearchResult {

	private String bin;
	private float reliabilityCode;
	private String businessName;
	private String phone;
	private AddressResult address;
	private int numberOfTradelines;
	private boolean financialStatementIndicator;
	private boolean keyFactsIndicator;
	private boolean inquiryIndicator;
	private boolean bankDataIndicator;
	private boolean governmentDataIndicator;
	private boolean executiveSummaryIndicator;
	private boolean uccIndicator;
	private MatchingNameAndAddress matchingNameAndAddress;
	//private String comments;
	private BusinessGeocodeResult businessGeocode;
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public float getReliabilityCode() {
		return reliabilityCode;
	}
	public void setReliabilityCode(float reliabilityCode) {
		this.reliabilityCode = reliabilityCode;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public AddressResult getAddress() {
		return address;
	}
	public void setAddress(AddressResult address) {
		this.address = address;
	}
	public int getNumberOfTradelines() {
		return numberOfTradelines;
	}
	public void setNumberOfTradelines(int numberOfTradelines) {
		this.numberOfTradelines = numberOfTradelines;
	}
	public boolean isFinancialStatementIndicator() {
		return financialStatementIndicator;
	}
	public void setFinancialStatementIndicator(boolean financialStatementIndicator) {
		this.financialStatementIndicator = financialStatementIndicator;
	}
	public boolean isKeyFactsIndicator() {
		return keyFactsIndicator;
	}
	public void setKeyFactsIndicator(boolean keyFactsIndicator) {
		this.keyFactsIndicator = keyFactsIndicator;
	}
	public boolean isInquiryIndicator() {
		return inquiryIndicator;
	}
	public void setInquiryIndicator(boolean inquiryIndicator) {
		this.inquiryIndicator = inquiryIndicator;
	}
	public boolean isBankDataIndicator() {
		return bankDataIndicator;
	}
	public void setBankDataIndicator(boolean bankDataIndicator) {
		this.bankDataIndicator = bankDataIndicator;
	}
	public boolean isGovernmentDataIndicator() {
		return governmentDataIndicator;
	}
	public void setGovernmentDataIndicator(boolean governmentDataIndicator) {
		this.governmentDataIndicator = governmentDataIndicator;
	}
	public boolean isExecutiveSummaryIndicator() {
		return executiveSummaryIndicator;
	}
	public void setExecutiveSummaryIndicator(boolean executiveSummaryIndicator) {
		this.executiveSummaryIndicator = executiveSummaryIndicator;
	}
	public boolean isUccIndicator() {
		return uccIndicator;
	}
	public void setUccIndicator(boolean uccIndicator) {
		this.uccIndicator = uccIndicator;
	}
	public MatchingNameAndAddress getMatchingNameAndAddress() {
		return matchingNameAndAddress;
	}
	public void setMatchingNameAndAddress(MatchingNameAndAddress matchingNameAndAddress) {
		this.matchingNameAndAddress = matchingNameAndAddress;
	}
//	public String getComments() {
//		return comments;
//	}
//	public void setComments(String comments) {
//		this.comments = comments;
//	}
	public BusinessGeocodeResult getBusinessGeocode() {
		return businessGeocode;
	}
	public void setBusinessGeocode(BusinessGeocodeResult businessGeocode) {
		this.businessGeocode = businessGeocode;
	}
	
	
}
