package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class BusinessContactsResult {

	private BusinessHeaderResult businessHeader;
	private List <IndividualOwnersAndPrincipalsResult> individualOwnersAndPrincipals;
	private List <CompanyOwnersAndPrincipalsResult> companyOwnersAndPrincipals;
	private List <ContactsAndTitlesResult> contactsAndTitles;
	private List <ContactsBusinessAffiliationsResult> contactsBusinessAffiliations;
	
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public List<IndividualOwnersAndPrincipalsResult> getIndividualOwnersAndPrincipals() {
		return individualOwnersAndPrincipals;
	}
	public void setIndividualOwnersAndPrincipals(List<IndividualOwnersAndPrincipalsResult> individualOwnersAndPrincipals) {
		this.individualOwnersAndPrincipals = individualOwnersAndPrincipals;
	}
	public List<CompanyOwnersAndPrincipalsResult> getCompanyOwnersAndPrincipals() {
		return companyOwnersAndPrincipals;
	}
	public void setCompanyOwnersAndPrincipals(List<CompanyOwnersAndPrincipalsResult> companyOwnersAndPrincipals) {
		this.companyOwnersAndPrincipals = companyOwnersAndPrincipals;
	}
	public List<ContactsAndTitlesResult> getContactsAndTitles() {
		return contactsAndTitles;
	}
	public void setContactsAndTitles(List<ContactsAndTitlesResult> contactsAndTitles) {
		this.contactsAndTitles = contactsAndTitles;
	}
	public List<ContactsBusinessAffiliationsResult> getContactsBusinessAffiliations() {
		return contactsBusinessAffiliations;
	}
	public void setContactsBusinessAffiliations(List<ContactsBusinessAffiliationsResult> contactsBusinessAffiliations) {
		this.contactsBusinessAffiliations = contactsBusinessAffiliations;
	}
	
	
}
