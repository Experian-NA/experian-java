package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.LiensServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.LiensServiceResponse;
import com.experian.bis.api.lib.businessservices.service.LiensService;

import junit.framework.Assert;

public class LiensServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			LiensService service = new LiensService(getServiceCredential());
			LiensServiceRequest request = new LiensServiceRequest();
			request.setLienSummary(true);
			request.setLienDetail(true);
			request.setBin("796744203");
			request.setSubcode("0563736");

			LiensServiceResponse response = (LiensServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& response.getResults().getLienSummary() != null && response.getResults().getLienDetail() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Liens Service");
		}
	}

}
