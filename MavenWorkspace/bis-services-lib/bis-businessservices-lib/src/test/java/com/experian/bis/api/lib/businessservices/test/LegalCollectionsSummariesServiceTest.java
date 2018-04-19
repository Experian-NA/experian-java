package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.LegalCollectionsSummariesServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.LegalCollectionsSummariesServiceResponse;
import com.experian.bis.api.lib.businessservices.service.LegalCollectionsSummariesService;

import junit.framework.Assert;

public class LegalCollectionsSummariesServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			LegalCollectionsSummariesService service = new LegalCollectionsSummariesService(getServiceCredential());
			LegalCollectionsSummariesServiceRequest request = new LegalCollectionsSummariesServiceRequest();
			request.setLegalFilingsCollectionsSummary(true);
			request.setLegalFilingsSummary(true);
			request.setBin("796744203");
			request.setSubcode("563736");

			LegalCollectionsSummariesServiceResponse response = (LegalCollectionsSummariesServiceResponse) service
					.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& response.getResults().getLegalFilingsCollectionsSummary() != null
					&& response.getResults().getLegalFilingsSummary() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Legal Collections Summaries Service");
		}
	}

}
