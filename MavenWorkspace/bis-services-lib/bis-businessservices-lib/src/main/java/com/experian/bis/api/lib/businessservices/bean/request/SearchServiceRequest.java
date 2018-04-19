package com.experian.bis.api.lib.businessservices.bean.request;

import com.experian.bis.api.lib.common.BISServiceException;
import com.fasterxml.jackson.annotation.JsonIgnore;
public class SearchServiceRequest extends BusinessServiceRequest {
	private String name; 
	private String city; 
	private String state; 
	private String street; 
	private String zip; 
	private String phone; 
	private String taxId; 
	private String comments; 
	private boolean geo;
	@JsonIgnore
	private String bin;
	
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
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public boolean isGeo() {
		return geo;
	}
	public void setGeo(boolean geo) {
		this.geo = geo;
	}
	public String getBin() throws BISServiceException {
		throw new BISServiceException("Parameter not supported");
	}
	public void setBin(String bin) throws BISServiceException {
		throw new BISServiceException("Parameter not supported");
	}

	
}
