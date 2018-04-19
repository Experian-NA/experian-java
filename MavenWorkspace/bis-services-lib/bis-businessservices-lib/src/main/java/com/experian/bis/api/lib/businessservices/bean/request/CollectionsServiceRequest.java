package com.experian.bis.api.lib.businessservices.bean.request;

public class CollectionsServiceRequest extends BusinessServiceRequest {

	private boolean collectionsSummary; 
	private boolean collectionsDetail;
	
	public boolean isCollectionsSummary() {
		return collectionsSummary;
	}
	public void setCollectionsSummary(boolean collectionsSummary) {
		this.collectionsSummary = collectionsSummary;
	}
	public boolean isCollectionsDetail() {
		return collectionsDetail;
	}
	public void setCollectionsDetail(boolean collectionsDetail) {
		this.collectionsDetail = collectionsDetail;
	}
	
	
}
