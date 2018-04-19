package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class ScoresSearchResult {

	private BusinessHeaderResult businessHeader;
	private CommercialScoreResult commercialScore;
	private List <CommercialScoreFactorsResult> commercialScoreFactors;
	private List <CommercialScoreTrendsResult> commercialScoreTrends;
	private FSRScoreResult fsrScore;
	private List <FSRScoreFactorsResult> fsrScoreFactors;
	private List <FSRScoreTrendsResult> fsrScoreTrends;
	private List <SearchResult> listOfSimilars;
	
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public CommercialScoreResult getCommercialScore() {
		return commercialScore;
	}
	public void setCommercialScore(CommercialScoreResult commercialScore) {
		this.commercialScore = commercialScore;
	}
	
	
	public List<CommercialScoreFactorsResult> getCommercialScoreFactors() {
		return commercialScoreFactors;
	}
	public void setCommercialScoreFactors(List<CommercialScoreFactorsResult> commercialScoreFactors) {
		this.commercialScoreFactors = commercialScoreFactors;
	}
	public List<CommercialScoreTrendsResult> getCommercialScoreTrends() {
		return commercialScoreTrends;
	}
	public void setCommercialScoreTrends(List<CommercialScoreTrendsResult> commercialScoreTrends) {
		this.commercialScoreTrends = commercialScoreTrends;
	}
	public FSRScoreResult getFsrScore() {
		return fsrScore;
	}
	public void setFsrScore(FSRScoreResult fsrScore) {
		this.fsrScore = fsrScore;
	}
	public List<FSRScoreFactorsResult> getFsrScoreFactors() {
		return fsrScoreFactors;
	}
	public void setFsrScoreFactors(List<FSRScoreFactorsResult> fsrScoreFactors) {
		this.fsrScoreFactors = fsrScoreFactors;
	}
	public List<FSRScoreTrendsResult> getFsrScoreTrends() {
		return fsrScoreTrends;
	}
	public void setFsrScoreTrends(List<FSRScoreTrendsResult> fsrScoreTrends) {
		this.fsrScoreTrends = fsrScoreTrends;
	}
	public List<SearchResult> getListOfSimilars() {
		return listOfSimilars;
	}
	public void setListOfSimilars(List<SearchResult> listOfSimilars) {
		this.listOfSimilars = listOfSimilars;
	}
	
	
	
}

