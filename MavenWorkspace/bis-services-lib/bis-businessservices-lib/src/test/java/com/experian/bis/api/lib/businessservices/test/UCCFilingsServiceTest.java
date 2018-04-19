package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.UCCFilingsServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.UCCFilingsServiceResponse;
import com.experian.bis.api.lib.businessservices.service.UCCFilingsService;

import junit.framework.Assert;

public class UCCFilingsServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			UCCFilingsService service = new UCCFilingsService(getServiceCredential());
			UCCFilingsServiceRequest request = new UCCFilingsServiceRequest();
			request.setUccFilingsSummary(true);
			request.setUccFilingsDetail(true);
			request.setBin("404197602");
			request.setSubcode("0563736");

			UCCFilingsServiceResponse response = (UCCFilingsServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& response.getResults().getUccFilingsSummary() != null
					&& response.getResults().getUccFilingsDetail() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for UCCFilings Service");
		}
	}

}
