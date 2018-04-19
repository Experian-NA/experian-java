package com.experian.bis.api.lib.businessservices.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.experian.bis.api.lib.businessservices.bean.request.CollectionsServiceRequest;
import com.experian.bis.api.lib.businessservices.bean.response.CollectionsServiceResponse;
import com.experian.bis.api.lib.businessservices.service.CollectionsService;

import junit.framework.Assert;

public class CollectionsServiceTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			CollectionsService service = new CollectionsService(getServiceCredential());
			CollectionsServiceRequest request = new CollectionsServiceRequest();
			request.setCollectionsSummary(true);
			request.setCollectionsDetail(true);
			request.setBin("722799117");
			request.setSubcode("0563736");

			CollectionsServiceResponse response = (CollectionsServiceResponse) service.execute(request);
			Assert.assertEquals(response.getResults() != null && response.getResults().getBusinessHeader() != null
					&& response.getResults().getCollectionsSummary() != null
					&& response.getResults().getCollectionsDetail() != null
					&& StringUtils.isNotBlank(response.getRequestId()), true);
		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Collections Service");
		}
	}

}
