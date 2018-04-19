package com.experian.bis.api.lib.businessservices.service;

import java.net.Proxy;
import java.util.Map;

import com.experian.bis.api.lib.businessservices.bean.request.ScoresServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.request.BusinessServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.ScoresServiceResponse;
import com.experian.bis.api.lib.businessservices.bean.response.BusinessServiceResponse;
import com.experian.bis.api.lib.common.BISServiceCredential;
import com.experian.bis.api.lib.common.BISServiceException;
import com.experian.bis.api.lib.common.RequestMethod;

/**
 * <code>ScoresService</code> is the child class of BusinessService
 * Class for building the url and response body
 */
public class ScoresService extends BusinessService{
	
	private static final String SERVICE_ID = "scores";

	/**
	 * Constructor with
	 * {@link BISServiceCredential} param type
	 * 
	 * @param serviceCredential
	 */
	public ScoresService(BISServiceCredential serviceCredential) {
		super(serviceCredential);
	}

	/**
	 * Constructor with {@link java.net.Proxy} param type
	 * 
	 * @param proxy
	 */
	public ScoresService(Proxy proxy) {
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
	public ScoresService(BISServiceCredential serviceCredential, Proxy proxy) {
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
		ScoresServiceRequest request = (ScoresServiceRequest) businessServiceRequest;
		String requestUrl = getServiceUrl();
		String requestBody = constructPostRequestBody(request);
		Map<String, String> requestHeaders = getBasicRequestHeaderMap();
		callService(requestUrl, requestBody, requestHeaders, RequestMethod.POST);
		//call service, do processing here
		ScoresServiceResponse response = (ScoresServiceResponse) parseResponseToObject(ScoresServiceResponse.class);
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
