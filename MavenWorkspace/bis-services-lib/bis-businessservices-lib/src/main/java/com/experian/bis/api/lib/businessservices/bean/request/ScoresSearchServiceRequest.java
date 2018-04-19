package com.experian.bis.api.lib.businessservices.bean.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ScoresSearchServiceRequest extends BusinessServiceRequest{

//	private SearchServiceRequest searchClass;
//	private int matchReliabilityCode;
//	private ScoresServiceRequest scoreClass;
//	
//	public SearchServiceRequest getSearchClass() {
//		return searchClass;
//	}
//	public void setSearchClass(SearchServiceRequest searchClass) {
//		this.searchClass = searchClass;
//	}
//	public int getMatchReliabilityCode() {
//		return matchReliabilityCode;
//	}
//	public void setMatchReliabilityCode(int matchReliabilityCode) {
//		this.matchReliabilityCode = matchReliabilityCode;
//	}
//	public ScoresServiceRequest getScoreClass() {
//		return scoreClass;
//	}
//	public void setScoreClass(ScoresServiceRequest scoreClass) {
//		this.scoreClass = scoreClass;
//	}
	
	private String name; 
	private String city; 
	private String state; 
	private String street; 
	private String zip; 
	private String phone; 
	private String taxId; 
	private String comments; 
	private boolean geo;
	@JsonIgnore
	private String bin;
	
	private int matchReliabilityCode;
	
	private String modelCode;
	private boolean commercialScore;
	private boolean fsrScore;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public boolean isGeo() {
		return geo;
	}
	public void setGeo(boolean geo) {
		this.geo = geo;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public int getMatchReliabilityCode() {
		return matchReliabilityCode;
	}
	public void setMatchReliabilityCode(int matchReliabilityCode) {
		this.matchReliabilityCode = matchReliabilityCode;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public boolean isCommercialScore() {
		return commercialScore;
	}
	public void setCommercialScore(boolean commercialScore) {
		this.commercialScore = commercialScore;
	}
	public boolean isFsrScore() {
		return fsrScore;
	}
	public void setFsrScore(boolean fsrScore) {
		this.fsrScore = fsrScore;
	}
	
	
}
