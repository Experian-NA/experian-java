package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class ContactsBusinessAffiliationsResult {

	private String bin;
	private String businessName;
	private BusinessContactsAddressResult businessContactsAddress;
	//private ContactsAndTitlesResult contactsAndTitles;
	private List <ContactsAndTitlesResult> contactsAndTitles;
	
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
	public BusinessContactsAddressResult getBusinessContactsAddress() {
		return businessContactsAddress;
	}
	public void setBusinessContactsAddress(BusinessContactsAddressResult businessContactsAddress) {
		this.businessContactsAddress = businessContactsAddress;
	}
//	public ContactsAndTitlesResult getContactsAndTitles() {
//		return contactsAndTitles;
//	}
//	public void setContactsAndTitles(ContactsAndTitlesResult contactsAndTitles) {
//		this.contactsAndTitles = contactsAndTitles;
//	}
	public List<ContactsAndTitlesResult> getContactsAndTitles() {
		return contactsAndTitles;
	}
	public void setContactsAndTitles(List<ContactsAndTitlesResult> contactsAndTitles) {
		this.contactsAndTitles = contactsAndTitles;
	}
	
	
	
}
