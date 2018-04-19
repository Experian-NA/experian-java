package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.RiskDashboardsServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.RiskDashboardsServiceResponse;
import com.experian.bis.api.lib.businessservices.service.RiskDashboardsService;

import junit.framework.Assert;

public class RiskDashboardsServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			RiskDashboardsService service = new RiskDashboardsService(getServiceCredential());
			RiskDashboardsServiceRequest request = new RiskDashboardsServiceRequest();

			request.setBin("700000026");
			request.setSubcode("0179116");

			RiskDashboardsServiceResponse response = (RiskDashboardsServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Risk Dashboards Service");
		}
	}

}
