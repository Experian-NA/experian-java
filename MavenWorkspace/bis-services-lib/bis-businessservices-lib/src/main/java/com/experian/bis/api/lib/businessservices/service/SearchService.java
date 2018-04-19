package com.experian.bis.api.lib.businessservices.service;

import java.net.Proxy;
import java.util.Map;

import com.experian.bis.api.lib.businessservices.bean.request.BusinessServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.request.SearchServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.BusinessServiceResponse;
import com.experian.bis.api.lib.businessservices.bean.response.SearchServiceResponse;
import com.experian.bis.api.lib.common.BISServiceCredential;
import com.experian.bis.api.lib.common.BISServiceException;
import com.experian.bis.api.lib.common.RequestMethod;

/**
 * <code>SearchService</code> is the child class of BusinessService
 * Class for building the url and response body
 */
public class SearchService extends BusinessService {
	
	private static final String SERVICE_ID = "search";

	/**
	 * Constructor with
	 * {@link BISServiceCredential} param type
	 * 
	 * @param serviceCredential
	 */
	public SearchService(BISServiceCredential serviceCredential) {
		super(serviceCredential);
	}

	/**
	 * Constructor with {@link java.net.Proxy} param type
	 * 
	 * @param proxy
	 */
	public SearchService(Proxy proxy) {
		super(proxy);
	}

	/**
	 * Constructor with
	 * {@link BISServiceCredential} and
	 * {@link java.net.Proxy} param type
	 * 
	 * @param serviceCredential get authentication token and environmental variable
	 * @param proxy set the proxy setting
	 */
	public SearchService(BISServiceCredential serviceCredential, Proxy proxy) {
		super(serviceCredential, proxy);
	}
	
	/**
	 * Return the response after creating request body, url and it calls the POST service to get the response
	 * @param businessServiceRequest request for business services
	 * @return response expected response for given request
	 * @throws BISServiceException If BIS service related exception occurred
	 * (non-Javadoc)
	 * @see com.experian.bis.api.lib.businessservices.service.BusinessService#execute(com.experian.bis.api.lib.businessservices.bean.request.BusinessServiceRequest)
	 */
	public BusinessServiceResponse execute(BusinessServiceRequest businessServiceRequest) throws BISServiceException {
		SearchServiceRequest request = (SearchServiceRequest) businessServiceRequest;
		String requestUrl = getServiceUrl();
		String requestBody = constructPostRequestBody(request);
		Map<String, String> requestHeaders = getBasicRequestHeaderMap();
		callService(requestUrl, requestBody, requestHeaders, RequestMethod.GET);
		//call service, do processing here
		SearchServiceResponse response = (SearchServiceResponse) parseResponseToObject(SearchServiceResponse.class);
		return response;
	}
	
	/**
     * @override
     * overriden method from BusinessService class to send service ID for building URL
     */
	@Override
	public String getServiceId() {
		return SERVICE_ID;
	}

}
