package com.experian.bis.api.lib.businessservices.bean.response;

public class CorporateRegistrationsResult {

	private BusinessHeaderResult businessHeader;
	private String legalName;
	private String stateOfOrigin;
	private String originalFilingDate;
	private String recentFilingDate;
	private String incorporatedDate;
	private String businessType;
	private String statusFlag;
	private String statusDescription;
	private String statusDescriptionDetail;
	private String profitFlag;
	private String charterNumber;
	private int existenceTermYears;
	private String existenceTermDate;
	private String federalTaxId;
	private String stateTaxId;
	private String domesticForeignIndicator;
	private String agentName;
	AgentAddressResult agentAddress;
	private boolean corporateRegistrationIndicator;
	
	
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getStateOfOrigin() {
		return stateOfOrigin;
	}
	public void setStateOfOrigin(String stateOfOrigin) {
		this.stateOfOrigin = stateOfOrigin;
	}
	public String getOriginalFilingDate() {
		return originalFilingDate;
	}
	public void setOriginalFilingDate(String originalFilingDate) {
		this.originalFilingDate = originalFilingDate;
	}
	public String getRecentFilingDate() {
		return recentFilingDate;
	}
	public void setRecentFilingDate(String recentFilingDate) {
		this.recentFilingDate = recentFilingDate;
	}
	public String getIncorporatedDate() {
		return incorporatedDate;
	}
	public void setIncorporatedDate(String incorporatedDate) {
		this.incorporatedDate = incorporatedDate;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getStatusFlag() {
		return statusFlag;
	}
	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public String getStatusDescriptionDetail() {
		return statusDescriptionDetail;
	}
	public void setStatusDescriptionDetail(String statusDescriptionDetail) {
		this.statusDescriptionDetail = statusDescriptionDetail;
	}
	public String getProfitFlag() {
		return profitFlag;
	}
	public void setProfitFlag(String profitFlag) {
		this.profitFlag = profitFlag;
	}
	public String getCharterNumber() {
		return charterNumber;
	}
	public void setCharterNumber(String charterNumber) {
		this.charterNumber = charterNumber;
	}
	public int getExistenceTermYears() {
		return existenceTermYears;
	}
	public void setExistenceTermYears(int existenceTermYears) {
		this.existenceTermYears = existenceTermYears;
	}
	public String getExistenceTermDate() {
		return existenceTermDate;
	}
	public void setExistenceTermDate(String existenceTermDate) {
		this.existenceTermDate = existenceTermDate;
	}
	public String getFederalTaxId() {
		return federalTaxId;
	}
	public void setFederalTaxId(String federalTaxId) {
		this.federalTaxId = federalTaxId;
	}
	public String getStateTaxId() {
		return stateTaxId;
	}
	public void setStateTaxId(String stateTaxId) {
		this.stateTaxId = stateTaxId;
	}
	public String getDomesticForeignIndicator() {
		return domesticForeignIndicator;
	}
	public void setDomesticForeignIndicator(String domesticForeignIndicator) {
		this.domesticForeignIndicator = domesticForeignIndicator;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public AgentAddressResult getAgentAddress() {
		return agentAddress;
	}
	public void setAgentAddress(AgentAddressResult agentAddress) {
		this.agentAddress = agentAddress;
	}
	public boolean isCorporateRegistrationIndicator() {
		return corporateRegistrationIndicator;
	}
	public void setCorporateRegistrationIndicator(boolean corporateRegistrationIndicator) {
		this.corporateRegistrationIndicator = corporateRegistrationIndicator;
	}
	
	
}
