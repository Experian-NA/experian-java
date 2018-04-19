package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.JudgmentsServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.JudgmentsServiceResponse;
import com.experian.bis.api.lib.businessservices.service.JudgmentsService;

import junit.framework.Assert;

public class JudgmentsServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			JudgmentsService service = new JudgmentsService(getServiceCredential());
			JudgmentsServiceRequest request = new JudgmentsServiceRequest();
			request.setJudgmentSummary(true);
			request.setJudgmentDetail(true);
			request.setBin("796744203");
			request.setSubcode("563736");

			JudgmentsServiceResponse response = (JudgmentsServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& response.getResults().getJudgmentSummary() != null
					&& response.getResults().getJudgmentDetail() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Judgments Service");
		}
	}

}
