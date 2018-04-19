package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class ReversePhonesServiceResponse extends BusinessServiceResponse{
	
	private List<ReversePhonesItemsResult> reversePhones;

	public List<ReversePhonesItemsResult> getReversePhones() {
		return reversePhones;
	}

	public void setReverseAddresses(List<ReversePhonesItemsResult> reversePhones) {
		this.reversePhones = reversePhones;
	}

}


//public class ReversePhonesServiceResponse extends BusinessServiceResponse{
//	
//	private List<ReversePhonesItemsResult> results;
//
//	public List<ReversePhonesItemsResult> getResults() {
//		return results;
//	}
//
//	public void setReverseAddresses(List<ReversePhonesItemsResult> results) {
//		this.results = results;
//	}
//
//}
