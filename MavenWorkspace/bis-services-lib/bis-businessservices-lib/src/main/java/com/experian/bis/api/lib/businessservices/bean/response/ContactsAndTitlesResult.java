package com.experian.bis.api.lib.businessservices.bean.response;

public class ContactsAndTitlesResult {

	private int sequenceNumber;
	private String cid;
	private String title;
	private boolean contactActivityIndicator;
	private String contactSupplier;
	private String firstName;
	private String middleName;
	private String lastName;
	private String generationCode;
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isContactActivityIndicator() {
		return contactActivityIndicator;
	}
	public void setContactActivityIndicator(boolean contactActivityIndicator) {
		this.contactActivityIndicator = contactActivityIndicator;
	}
	public String getContactSupplier() {
		return contactSupplier;
	}
	public void setContactSupplier(String contactSupplier) {
		this.contactSupplier = contactSupplier;
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
	
	
}
