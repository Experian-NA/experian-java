package com.experian.bis.api.lib.businessservices.bean.request;

import com.experian.bis.api.lib.common.BISServiceException;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ReverseTaxIDsServiceRequest extends BusinessServiceRequest{

	private String taxId ;
	@JsonIgnore
	private String bin;

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getBin() throws BISServiceException {
		throw new BISServiceException("Parameter not supported");
	}
	public void setBin(String bin) throws BISServiceException {
		throw new BISServiceException("Parameter not supported");
	}
	
}
