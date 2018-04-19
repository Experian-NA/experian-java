package com.experian.bis.api.lib.socialmediainsights.bean.request;

import com.experian.bis.api.lib.common.BISServiceException;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SocialMediaAttributesRequest {
	private String name;
	private String city; 
	private String state; 
	private String zip; 
	private String street; 
	private String phone; 
	private String taxId; 
	private int matchReliabilityCode=96;
	private String comments; 
	private String subcode;
	private String bin;

	public String getSubcode() {
		return subcode;
	}

	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}

	public String getBin() throws BISServiceException {
		return bin;
	}

	public void setBin(String bin) throws BISServiceException {
		this.bin = bin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public int getMatchReliabilityCode() {
		return matchReliabilityCode;
	}

	public void setMatchReliabilityCode(int matchReliabilityCode) {
		this.matchReliabilityCode = matchReliabilityCode;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
