package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.CreditStatusServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.CreditStatusServiceResponse;
import com.experian.bis.api.lib.businessservices.service.CreditStatusService;

import junit.framework.Assert;

public class CreditStatusServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			CreditStatusService service = new CreditStatusService(getServiceCredential());
			CreditStatusServiceRequest request = new CreditStatusServiceRequest();
			request.setBin("722799117");
			request.setSubcode("0179116");

			CreditStatusServiceResponse response = (CreditStatusServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null

					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for CreditStatus Service Service");
		}
	}

}