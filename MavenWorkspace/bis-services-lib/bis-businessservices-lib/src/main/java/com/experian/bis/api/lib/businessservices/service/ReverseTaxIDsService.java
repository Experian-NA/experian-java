package com.experian.bis.api.lib.businessservices.service;

import java.net.Proxy;
import java.util.Map;

import com.experian.bis.api.lib.businessservices.bean.request.BusinessServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.request.ReverseTaxIDsServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.BusinessServiceResponse;
import com.experian.bis.api.lib.businessservices.bean.response.ReverseTaxIDsServiceResponse;
import com.experian.bis.api.lib.common.BISServiceCredential;
import com.experian.bis.api.lib.common.BISServiceException;
import com.experian.bis.api.lib.common.RequestMethod;

public class ReverseTaxIDsService extends BusinessService{
	private static final String SERVICE_ID = "reversetaxids";

	public ReverseTaxIDsService(BISServiceCredential serviceCredential) {
		super(serviceCredential);
	}

	public ReverseTaxIDsService(Proxy proxy) {
		super(proxy);
	}

	public ReverseTaxIDsService(BISServiceCredential serviceCredential, Proxy proxy) {
		super(serviceCredential, proxy);
	}


	public BusinessServiceResponse execute(BusinessServiceRequest businessServiceRequest) throws BISServiceException {
		ReverseTaxIDsServiceRequest request = (ReverseTaxIDsServiceRequest) businessServiceRequest;
		String requestUrl = getServiceUrl();
		String requestBody = constructPostRequestBody(request);
		Map<String, String> requestHeaders = getBasicRequestHeaderMap();
		callService(requestUrl, requestBody, requestHeaders, RequestMethod.POST);
		//call service, do processing here
		ReverseTaxIDsServiceResponse response = (ReverseTaxIDsServiceResponse) parseResponseToObject(ReverseTaxIDsServiceResponse.class);
		return response;
	}
	
	@Override
	public String getServiceId() {
		return SERVICE_ID;
	}

}
