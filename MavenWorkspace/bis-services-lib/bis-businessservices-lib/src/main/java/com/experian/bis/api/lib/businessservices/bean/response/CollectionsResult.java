package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class CollectionsResult {

	private BusinessHeaderResult businessHeader;
	private CollectionsSummaryResult collectionsSummary;
	private List<CollectionsDetailResult> collectionsDetail;
	private boolean collectionsIndicator;
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public CollectionsSummaryResult getCollectionsSummary() {
		return collectionsSummary;
	}
	public void setCollectionsSummary(CollectionsSummaryResult collectionsSummary) {
		this.collectionsSummary = collectionsSummary;
	}
		
	
	public List<CollectionsDetailResult> getCollectionsDetail() {
		return collectionsDetail;
	}
	public void setCollectionsDetail(List<CollectionsDetailResult> collectionsDetail) {
		this.collectionsDetail = collectionsDetail;
	}
	public boolean isCollectionsIndicator() {
		return collectionsIndicator;
	}
	public void setCollectionsIndicator(boolean collectionsIndicator) {
		this.collectionsIndicator = collectionsIndicator;
	}
	
	
}
