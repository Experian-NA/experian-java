package com.experian.bis.api.lib.businessservices.bean.request;

import com.experian.bis.api.lib.common.BISServiceException;

public class BusinessServiceRequest {
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
	
}
