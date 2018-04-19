package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.CorporateLinkageServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.CorporateLinkageServiceResponse;
import com.experian.bis.api.lib.businessservices.service.CorporateLinkageService;

import junit.framework.Assert;

public class CorporateLinkageServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			CorporateLinkageService service = new CorporateLinkageService(getServiceCredential());
			CorporateLinkageServiceRequest request = new CorporateLinkageServiceRequest();

			request.setCorporateLinkagePartial(true);
			request.setCorporateLinkageFull(true);
			request.setBin("404197602");
			request.setSubcode("0563736");

			CorporateLinkageServiceResponse response = (CorporateLinkageServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& response.getResults().getCorporateLinkagePartial() != null
					&& response.getResults().getCorporateLinkageFull() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Corporate Linkage Service");
		}
	}

}
