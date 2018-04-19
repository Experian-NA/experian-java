package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.BusinessFactsServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.BusinessFactsServiceResponse;
import com.experian.bis.api.lib.businessservices.service.BusinessFactsService;

import junit.framework.Assert;

public class BusinessFactsServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			BusinessFactsService service = new BusinessFactsService(getServiceCredential());
			BusinessFactsServiceRequest request = new BusinessFactsServiceRequest();

			request.setBin("404197602");
			request.setSubcode("0563736");

			BusinessFactsServiceResponse response = (BusinessFactsServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& response.getResults().getSicCodes() != null && response.getResults().getNaicsCodes() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Business Facts Service");
		}
	}

}
