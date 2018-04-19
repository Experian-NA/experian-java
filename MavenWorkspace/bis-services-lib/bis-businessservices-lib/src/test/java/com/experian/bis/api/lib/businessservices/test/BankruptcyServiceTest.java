package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.BankruptcyServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.BankruptcyServiceResponse;
import com.experian.bis.api.lib.businessservices.service.BankruptcyService;

import junit.framework.Assert;

public class BankruptcyServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			BankruptcyService service = new BankruptcyService(getServiceCredential());
			BankruptcyServiceRequest request = new BankruptcyServiceRequest();
			request.setBankruptcySummary(true);
			request.setBankruptcyDetail(true);
			request.setBin("700000026");
			request.setSubcode("0179116");

			BankruptcyServiceResponse response = (BankruptcyServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& response.getResults().getBankruptcySummary() != null
					&& response.getResults().getBankruptcyDetail() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Bankruptcy Service");
		}
	}

}
