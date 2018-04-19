package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class UCCFilingsDetailResult {

	private String dateFiled;
	private String legalType;
	private String legalAction;
	private String documentNumber;
	private List <CollateralCodesResult> collateralCodes;
	private String filingLocation;
	private String securedParty;
	private String Assignee;
	public String getDateFiled() {
		return dateFiled;
	}
	public void setDateFiled(String dateFiled) {
		this.dateFiled = dateFiled;
	}
	public String getLegalType() {
		return legalType;
	}
	public void setLegalType(String legalType) {
		this.legalType = legalType;
	}
	public String getLegalAction() {
		return legalAction;
	}
	public void setLegalAction(String legalAction) {
		this.legalAction = legalAction;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	public List<CollateralCodesResult> getCollateralCodes() {
		return collateralCodes;
	}
	public void setCollateralCodes(List<CollateralCodesResult> collateralCodes) {
		this.collateralCodes = collateralCodes;
	}
	public String getFilingLocation() {
		return filingLocation;
	}
	public void setFilingLocation(String filingLocation) {
		this.filingLocation = filingLocation;
	}
	public String getSecuredParty() {
		return securedParty;
	}
	public void setSecuredParty(String securedParty) {
		this.securedParty = securedParty;
	}
	public String getAssignee() {
		return Assignee;
	}
	public void setAssignee(String assignee) {
		Assignee = assignee;
	}
	
	
}
