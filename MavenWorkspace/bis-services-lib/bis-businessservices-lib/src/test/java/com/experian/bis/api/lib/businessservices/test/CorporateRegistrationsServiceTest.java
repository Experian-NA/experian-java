package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.CorporateRegistrationsServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.CorporateRegistrationsServiceResponse;
import com.experian.bis.api.lib.businessservices.service.CorporateRegistrationsService;

import junit.framework.Assert;

public class CorporateRegistrationsServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			CorporateRegistrationsService service = new CorporateRegistrationsService(getServiceCredential());
			CorporateRegistrationsServiceRequest request = new CorporateRegistrationsServiceRequest();
			request.setStatusDescriptionDetail(true);
			request.setBin("700000026");
			request.setSubcode("0563736");

			CorporateRegistrationsServiceResponse response = (CorporateRegistrationsServiceResponse) service
					.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& response.getResults().getAgentAddress() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Corporate Registrations Service");
		}
	}
}
