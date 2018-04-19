package com.experian.bis.api.lib.socialmediainsights.test;

import org.junit.Test;

import com.experian.bis.api.lib.socialmediainsights.bean.request.SocialMediaAttributesRequest;
import com.experian.bis.api.lib.socialmediainsights.bean.response.SocialMediaAttributesResponse;
import com.experian.bis.api.lib.socialmediainsights.service.SocialMediaAttributesService;

import junit.framework.Assert;

public class SocialMediaAttributesTest extends ServiceTestBase {

	@Test
	public void testExecute() {
		try {
			SocialMediaAttributesService service = new SocialMediaAttributesService(getServiceCredential(), getProxy());
			SocialMediaAttributesRequest request = new SocialMediaAttributesRequest();
			request.setName("Apple");
			request.setStreet("1 Infinite");
			request.setCity("Cupertino");
			request.setState("CA");
			request.setSubcode("0563736");

			@SuppressWarnings("unused")
			SocialMediaAttributesResponse response = (SocialMediaAttributesResponse) service.execute(request);

		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.fail("Test Case failed for Social Media Insight Service");
		}
	}

}
