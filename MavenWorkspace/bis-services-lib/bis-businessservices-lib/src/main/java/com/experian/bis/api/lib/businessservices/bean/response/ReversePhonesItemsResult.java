package com.experian.bis.api.lib.businessservices.bean.response;

public class ReversePhonesItemsResult {
	private String sequenceNumber;
	private String bin;
	private String businessName;
	private AddressResult address;
	private String binEstablishDate;
	private String binActivityCode;
	private String binDateLastReported;
	public String getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
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
	public AddressResult getAddress() {
		return address;
	}
	public void setAddress(AddressResult address) {
		this.address = address;
	}
	public String getBinEstablishDate() {
		return binEstablishDate;
	}
	public void setBinEstablishDate(String binEstablishDate) {
		this.binEstablishDate = binEstablishDate;
	}
	public String getBinActivityCode() {
		return binActivityCode;
	}
	public void setBinActivityCode(String binActivityCode) {
		this.binActivityCode = binActivityCode;
	}
	public String getBinDateLastReported() {
		return binDateLastReported;
	}
	public void setBinDateLastReported(String binDateLastReported) {
		this.binDateLastReported = binDateLastReported;
	}
	
	
}