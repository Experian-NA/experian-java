package com.experian.bis.api.lib.businessservices.bean.response;

public class LegalFilingsCollectionsSummaryResult {

	private int legalCount;
	private int legalBalance;
	private int derogatoryLegalCount;
	private boolean bankruptcyIndicator;
	private int bankruptcyCount;
	private int lienCount;
	private int lienBalance;
	private int judgmentCount;
	private int judgmentBalance;
	private int uccFilingsCount;
	private int uccDerogatoryCount;
	private int collectionCount;
	private int collectionBalance;
	public int getLegalCount() {
		return legalCount;
	}
	public void setLegalCount(int legalCount) {
		this.legalCount = legalCount;
	}
	public int getLegalBalance() {
		return legalBalance;
	}
	public void setLegalBalance(int legalBalance) {
		this.legalBalance = legalBalance;
	}
	public int getDerogatoryLegalCount() {
		return derogatoryLegalCount;
	}
	public void setDerogatoryLegalCount(int derogatoryLegalCount) {
		this.derogatoryLegalCount = derogatoryLegalCount;
	}
	public boolean isBankruptcyIndicator() {
		return bankruptcyIndicator;
	}
	public void setBankruptcyIndicator(boolean bankruptcyIndicator) {
		this.bankruptcyIndicator = bankruptcyIndicator;
	}
	public int getBankruptcyCount() {
		return bankruptcyCount;
	}
	public void setBankruptcyCount(int bankruptcyCount) {
		this.bankruptcyCount = bankruptcyCount;
	}
	public int getLienCount() {
		return lienCount;
	}
	public void setLienCount(int lienCount) {
		this.lienCount = lienCount;
	}
	public int getLienBalance() {
		return lienBalance;
	}
	public void setLienBalance(int lienBalance) {
		this.lienBalance = lienBalance;
	}
	public int getJudgmentCount() {
		return judgmentCount;
	}
	public void setJudgmentCount(int judgmentCount) {
		this.judgmentCount = judgmentCount;
	}
	public int getJudgmentBalance() {
		return judgmentBalance;
	}
	public void setJudgmentBalance(int judgmentBalance) {
		this.judgmentBalance = judgmentBalance;
	}
	public int getUccFilingsCount() {
		return uccFilingsCount;
	}
	public void setUccFilingsCount(int uccFilingsCount) {
		this.uccFilingsCount = uccFilingsCount;
	}
	public int getUccDerogatoryCount() {
		return uccDerogatoryCount;
	}
	public void setUccDerogatoryCount(int uccDerogatoryCount) {
		this.uccDerogatoryCount = uccDerogatoryCount;
	}
	public int getCollectionCount() {
		return collectionCount;
	}
	public void setCollectionCount(int collectionCount) {
		this.collectionCount = collectionCount;
	}
	public int getCollectionBalance() {
		return collectionBalance;
	}
	public void setCollectionBalance(int collectionBalance) {
		this.collectionBalance = collectionBalance;
	}
	
	
}
