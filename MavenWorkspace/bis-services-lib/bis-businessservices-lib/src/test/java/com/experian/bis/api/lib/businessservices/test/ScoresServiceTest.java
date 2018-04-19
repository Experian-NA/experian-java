package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.ScoresServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.ScoresServiceResponse;
import com.experian.bis.api.lib.businessservices.service.ScoresService;

import junit.framework.Assert;

public class ScoresServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			ScoresService service = new ScoresService(getServiceCredential());
			ScoresServiceRequest request = new ScoresServiceRequest();
			request.setBin("404197602");
			request.setSubcode("0563736");
			request.setModelCode("000224");
			request.setCommercialScore(true);
			request.setFsrScore(true);

			ScoresServiceResponse response = (ScoresServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& response.getResults().getCommercialScore() != null && response.getResults().getFsrScore() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Scores Service");
		}
	}

}
