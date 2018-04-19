package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class ReverseAddressesServiceResponse extends BusinessServiceResponse{

	private List<ReverseAddressesItemsResult> results;

	public List<ReverseAddressesItemsResult> getReverseAddresses() {
		return results;
	}

	public void setReverseAddresses(List<ReverseAddressesItemsResult> results) {
		this.results = results;
	}
	
	
	
}
