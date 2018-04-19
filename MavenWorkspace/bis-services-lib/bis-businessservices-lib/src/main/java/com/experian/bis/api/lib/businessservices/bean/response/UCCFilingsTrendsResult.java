package com.experian.bis.api.lib.businessservices.bean.response;

public class UCCFilingsTrendsResult {
	private String date;
	private int count;
	private int derogatoryCount;
	private int releasesAndTerminationsCount;
	private int continuationsCount;
	private int amendedAndAssignedCount;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getDerogatoryCount() {
		return derogatoryCount;
	}
	public void setDerogatoryCount(int derogatoryCount) {
		this.derogatoryCount = derogatoryCount;
	}
	public int getReleasesAndTerminationsCount() {
		return releasesAndTerminationsCount;
	}
	public void setReleasesAndTerminationsCount(int releasesAndTerminationsCount) {
		this.releasesAndTerminationsCount = releasesAndTerminationsCount;
	}
	public int getContinuationsCount() {
		return continuationsCount;
	}
	public void setContinuationsCount(int continuationsCount) {
		this.continuationsCount = continuationsCount;
	}
	public int getAmendedAndAssignedCount() {
		return amendedAndAssignedCount;
	}
	public void setAmendedAndAssignedCount(int amendedAndAssignedCount) {
		this.amendedAndAssignedCount = amendedAndAssignedCount;
	}

}
