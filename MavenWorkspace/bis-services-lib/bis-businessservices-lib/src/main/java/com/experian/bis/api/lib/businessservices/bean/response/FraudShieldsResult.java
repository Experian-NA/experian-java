package com.experian.bis.api.lib.businessservices.bean.response;

public class FraudShieldsResult {

	private BusinessHeaderResult businessHeader;
	private String matchingBusinessAddress;
	private boolean activeBusinessIndicator;
	private OFACMatchWarningResult ofacMatchWarning;
	private boolean businessVictimStatementIndicator;
	private boolean businessRiskTriggersIndicator;
	private String businessRiskTriggersStatement;
	private boolean nameAddressVerificationIndicator;
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public String getMatchingBusinessAddress() {
		return matchingBusinessAddress;
	}
	public void setMatchingBusinessAddress(String matchingBusinessAddress) {
		this.matchingBusinessAddress = matchingBusinessAddress;
	}
	public boolean isActiveBusinessIndicator() {
		return activeBusinessIndicator;
	}
	public void setActiveBusinessIndicator(boolean activeBusinessIndicator) {
		this.activeBusinessIndicator = activeBusinessIndicator;
	}
	public OFACMatchWarningResult getOfacMatchWarning() {
		return ofacMatchWarning;
	}
	public void setOfacMatchWarning(OFACMatchWarningResult ofacMatchWarning) {
		this.ofacMatchWarning = ofacMatchWarning;
	}
	public boolean isBusinessVictimStatementIndicator() {
		return businessVictimStatementIndicator;
	}
	public void setBusinessVictimStatementIndicator(boolean businessVictimStatementIndicator) {
		this.businessVictimStatementIndicator = businessVictimStatementIndicator;
	}
	public boolean isBusinessRiskTriggersIndicator() {
		return businessRiskTriggersIndicator;
	}
	public void setBusinessRiskTriggersIndicator(boolean businessRiskTriggersIndicator) {
		this.businessRiskTriggersIndicator = businessRiskTriggersIndicator;
	}
	public String getBusinessRiskTriggersStatement() {
		return businessRiskTriggersStatement;
	}
	public void setBusinessRiskTriggersStatement(String businessRiskTriggersStatement) {
		this.businessRiskTriggersStatement = businessRiskTriggersStatement;
	}
	public boolean isNameAddressVerificationIndicator() {
		return nameAddressVerificationIndicator;
	}
	public void setNameAddressVerificationIndicator(boolean nameAddressVerificationIndicator) {
		this.nameAddressVerificationIndicator = nameAddressVerificationIndicator;
	}
	
	
}
