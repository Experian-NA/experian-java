package com.experian.bis.api.lib.businessservices.bean.request;

import com.experian.bis.api.lib.common.BISServiceException;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ReverseAddressesServiceRequest extends BusinessServiceRequest {

	private String street;
	private String city;
	private String state;
	private String zip;
	@JsonIgnore
	private String bin;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getBin() throws BISServiceException {
		throw new BISServiceException("Parameter not supported");
	}
	public void setBin(String bin) throws BISServiceException {
		throw new BISServiceException("Parameter not supported");
	}
	
}
