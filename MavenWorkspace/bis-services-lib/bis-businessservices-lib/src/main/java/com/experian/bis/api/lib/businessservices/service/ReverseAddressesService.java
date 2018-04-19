package com.experian.bis.api.lib.businessservices.service;

import java.net.Proxy;
import java.util.Map;

import com.experian.bis.api.lib.businessservices.bean.request.ReverseAddressesServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.request.BusinessServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.ReverseAddressesServiceResponse;
import com.experian.bis.api.lib.businessservices.bean.response.BusinessServiceResponse;
import com.experian.bis.api.lib.common.BISServiceCredential;
import com.experian.bis.api.lib.common.BISServiceException;
import com.experian.bis.api.lib.common.RequestMethod;


public class ReverseAddressesService extends BusinessService{
	private static final String SERVICE_ID = "reverseaddresses";

	public ReverseAddressesService(BISServiceCredential serviceCredential) {
		super(serviceCredential);
	}

	public ReverseAddressesService(Proxy proxy) {
		super(proxy);
	}

	public ReverseAddressesService(BISServiceCredential serviceCredential, Proxy proxy) {
		super(serviceCredential, proxy);
	}

//	public BusinessServiceResponse execute(BusinessServiceRequest businessServiceRequest) throws BISServiceException {
//		ReverseAddressesServiceRequest request = (ReverseAddressesServiceRequest) businessServiceRequest;
//		String requestUrl = getServiceUrl();
//		String requestBody = constructPostRequestBody(request);
//		Map<String, String> requestHeaders = getBasicRequestHeaderMap();
//		callService(requestUrl, requestBody, requestHeaders, RequestMethod.POST);
//		//call service, do processing here
//		ReverseAddressesServiceResponse response = (ReverseAddressesServiceResponse) parseResponseToObject(ReverseAddressesServiceResponse.class);
//		return response;
//	}
	public BusinessServiceResponse execute(BusinessServiceRequest businessServiceRequest) throws BISServiceException {
		ReverseAddressesServiceRequest request = (ReverseAddressesServiceRequest) businessServiceRequest;
		String requestUrl = getServiceUrl();
		String requestBody = constructPostRequestBody(request);
		Map<String, String> requestHeaders = getBasicRequestHeaderMap();
		callService(requestUrl, requestBody, requestHeaders, RequestMethod.POST);
		//call service, do processing here
		ReverseAddressesServiceResponse response = (ReverseAddressesServiceResponse) parseResponseToObject(ReverseAddressesServiceResponse.class);
		return response;
	}
	
	@Override
	public String getServiceId() {
		return SERVICE_ID;
	}

}
