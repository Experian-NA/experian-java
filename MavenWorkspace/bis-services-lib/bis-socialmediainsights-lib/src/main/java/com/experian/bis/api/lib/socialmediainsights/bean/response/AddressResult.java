package com.experian.bis.api.lib.socialmediainsights.bean.response;

import java.io.Serializable;

public class AddressResult implements Serializable {
	private String street;
	private String city;
	private String state;
	private String zip;
	private String zipExtension;

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

	public String getZipExtension() {
		return zipExtension;
	}

	public void setZipExtension(String zipExtension) {
		this.zipExtension = zipExtension;
	}

}
