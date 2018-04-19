package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.SearchServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.SearchServiceResponse;
import com.experian.bis.api.lib.businessservices.service.SearchService;

import junit.framework.Assert;

public class SearchServiceTest extends ServiceTestBase {
	@Test
	public void testExecute() {
		try {
			SearchService service = new SearchService(getServiceCredential());
			SearchServiceRequest request = new SearchServiceRequest();
			request.setName("EXPERIAN & CONSUMER DIRECT");
			request.setCity("Costa Mesa");
			request.setState("CA");
			request.setSubcode("0179116");

			SearchServiceResponse response = (SearchServiceResponse) service.execute(request);
			Assert.assertEquals(
					response.getResults() != null && response.getResults().getMatchingNameAndAddress() != null
							&& response.getResults().getBusinessGeocode() != null
							&& StringUtils.isNotBlank(response.getRequestId()),
					true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Search Service");
		}
	}

}