package com.experian.bis.api.lib.businessservices.bean.response;

public class TradeNewAndContinuousResult {

	private String businessCategory;
	private String dateReported;
	private String dateLastActivity;
	private String terms;
	private RecentHighCreditResult recentHighCredit;
	private AccountBalanceResult accountBalance ;
	private int currentPercentage ;
	private int dbt30;
	private int dbt60;
	private int dbt90;
	private int dbt91Plus;
	private String comments;
	private boolean newlyReportedIndicator;
	private boolean customerDisputeIndicator;
	public String getBusinessCategory() {
		return businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}
	public String getDateReported() {
		return dateReported;
	}
	public void setDateReported(String dateReported) {
		this.dateReported = dateReported;
	}
	public String getDateLastActivity() {
		return dateLastActivity;
	}
	public void setDateLastActivity(String dateLastActivity) {
		this.dateLastActivity = dateLastActivity;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public RecentHighCreditResult getRecentHighCredit() {
		return recentHighCredit;
	}
	public void setRecentHighCredit(RecentHighCreditResult recentHighCredit) {
		this.recentHighCredit = recentHighCredit;
	}
	public AccountBalanceResult getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(AccountBalanceResult accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getCurrentPercentage() {
		return currentPercentage;
	}
	public void setCurrentPercentage(int currentPercentage) {
		this.currentPercentage = currentPercentage;
	}
	public int getDbt30() {
		return dbt30;
	}
	public void setDbt30(int dbt30) {
		this.dbt30 = dbt30;
	}
	public int getDbt60() {
		return dbt60;
	}
	public void setDbt60(int dbt60) {
		this.dbt60 = dbt60;
	}
	public int getDbt90() {
		return dbt90;
	}
	public void setDbt90(int dbt90) {
		this.dbt90 = dbt90;
	}
	public int getDbt91Plus() {
		return dbt91Plus;
	}
	public void setDbt91Plus(int dbt91Plus) {
		this.dbt91Plus = dbt91Plus;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public boolean isNewlyReportedIndicator() {
		return newlyReportedIndicator;
	}
	public void setNewlyReportedIndicator(boolean newlyReportedIndicator) {
		this.newlyReportedIndicator = newlyReportedIndicator;
	}
	public boolean isCustomerDisputeIndicator() {
		return customerDisputeIndicator;
	}
	public void setCustomerDisputeIndicator(boolean customerDisputeIndicator) {
		this.customerDisputeIndicator = customerDisputeIndicator;
	}
	
	
}
