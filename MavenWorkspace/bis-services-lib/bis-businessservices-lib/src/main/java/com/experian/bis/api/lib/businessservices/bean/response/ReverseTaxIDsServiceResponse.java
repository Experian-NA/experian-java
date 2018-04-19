package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class ReverseTaxIDsServiceResponse extends BusinessServiceResponse{

	private List<ReverseTaxIDsItemsResult> reverseTaxIds;

	public List<ReverseTaxIDsItemsResult> getReverseTaxIds() {
		return reverseTaxIds;
	}

	public void setReverseTaxIds(List<ReverseTaxIDsItemsResult> reverseTaxIds) {
		this.reverseTaxIds = reverseTaxIds;
	}
	
}
