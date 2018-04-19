package com.experian.bis.api.lib.businessservices.bean.response;

public class CollectionsDetailResult {

	private String accountStatus;
	private String datePlacedForCollection;
	private String dateClosed;
	private int amountPlacedForCollection;
	private int amountPaid;
	private CollectionAgencyInfoResult collectionAgencyInfo;
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	
	public String getDatePlacedForCollection() {
		return datePlacedForCollection;
	}
	public void setDatePlacedForCollection(String datePlacedForCollection) {
		this.datePlacedForCollection = datePlacedForCollection;
	}
	public String getDateClosed() {
		return dateClosed;
	}
	public void setDateClosed(String dateClosed) {
		this.dateClosed = dateClosed;
	}
	public int getAmountPlacedForCollection() {
		return amountPlacedForCollection;
	}
	public void setAmountPlacedForCollection(int amountPlacedForCollection) {
		this.amountPlacedForCollection = amountPlacedForCollection;
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	public CollectionAgencyInfoResult getCollectionAgencyInfo() {
		return collectionAgencyInfo;
	}
	public void setCollectionAgencyInfo(CollectionAgencyInfoResult collectionAgencyInfo) {
		this.collectionAgencyInfo = collectionAgencyInfo;
	}
	
	
}
