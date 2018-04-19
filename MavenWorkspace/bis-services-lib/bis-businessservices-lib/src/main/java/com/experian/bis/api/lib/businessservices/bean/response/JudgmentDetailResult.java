package com.experian.bis.api.lib.businessservices.bean.response;

public class JudgmentDetailResult {

	private String dateFiled;
	private String legalType;
	private String legalAction;
	private String documentNumber;
	private String filingLocation;
	private int liabilityAmount;
	private String plaintiffName;
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
	public String getFilingLocation() {
		return filingLocation;
	}
	public void setFilingLocation(String filingLocation) {
		this.filingLocation = filingLocation;
	}
	public int getLiabilityAmount() {
		return liabilityAmount;
	}
	public void setLiabilityAmount(int liabilityAmount) {
		this.liabilityAmount = liabilityAmount;
	}
	public String getPlaintiffName() {
		return plaintiffName;
	}
	public void setPlaintiffName(String plaintiffName) {
		this.plaintiffName = plaintiffName;
	}
	
	
	
}
