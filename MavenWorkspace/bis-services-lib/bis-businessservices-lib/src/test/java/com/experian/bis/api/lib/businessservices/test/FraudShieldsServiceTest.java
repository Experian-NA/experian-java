package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.FraudShieldsServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.FraudShieldsServiceResponse;
import com.experian.bis.api.lib.businessservices.service.FraudShieldsService;

import junit.framework.Assert;

public class FraudShieldsServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			FraudShieldsService service = new FraudShieldsService(getServiceCredential());
			FraudShieldsServiceRequest request = new FraudShieldsServiceRequest();

			request.setBin("404197602");
			request.setSubcode("0563736");

			FraudShieldsServiceResponse response = (FraudShieldsServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Fraud Shields Service");
		}
	}

}
