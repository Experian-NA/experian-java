package com.experian.bis.api.lib.businessservices.bean.request;

public class CorporateRegistrationsServiceRequest extends BusinessServiceRequest {

	private boolean statusDescriptionDetail;

	public boolean isStatusDescriptionDetail() {
		return statusDescriptionDetail;
	}

	public void setStatusDescriptionDetail(boolean statusDescriptionDetail) {
		this.statusDescriptionDetail = statusDescriptionDetail;
	}
	
	
}
