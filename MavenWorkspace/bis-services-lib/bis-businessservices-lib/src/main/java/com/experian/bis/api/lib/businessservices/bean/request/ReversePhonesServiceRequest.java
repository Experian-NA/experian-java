package com.experian.bis.api.lib.businessservices.bean.request;

import com.experian.bis.api.lib.common.BISServiceException;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ReversePhonesServiceRequest extends BusinessServiceRequest{

	private String phone;
	@JsonIgnore
	private String bin;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBin() throws BISServiceException {
		throw new BISServiceException("Parameter not supported");
	}
	public void setBin(String bin) throws BISServiceException {
		throw new BISServiceException("Parameter not supported");
	}
	
	
	
}
