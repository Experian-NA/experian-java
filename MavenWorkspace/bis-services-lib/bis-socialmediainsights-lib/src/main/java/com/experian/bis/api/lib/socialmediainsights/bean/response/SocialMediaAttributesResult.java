package com.experian.bis.api.lib.socialmediainsights.bean.response;


public class SocialMediaAttributesResult {
	
	private String  bin;
	private MatchedBusinessResult matchedBusiness;
	private SocialAttributes socialAttributes;
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public MatchedBusinessResult getMatchedBusiness() {
		return matchedBusiness;
	}
	public void setMatchedBusiness(MatchedBusinessResult matchedBusiness) {
		this.matchedBusiness = matchedBusiness;
	}
	public SocialAttributes getSocialAttributes() {
		return socialAttributes;
	}
	public void setSocialAttributes(SocialAttributes socialAttributes) {
		this.socialAttributes = socialAttributes;
	}
	
	
}