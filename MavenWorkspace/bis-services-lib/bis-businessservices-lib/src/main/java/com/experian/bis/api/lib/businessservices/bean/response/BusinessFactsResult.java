package com.experian.bis.api.lib.businessservices.bean.response;

import java.util.List;

public class BusinessFactsResult {
	private BusinessHeaderResult businessHeader;
	private List<SicCodesResult> sicCodes;
	private List<NaicsCodesResult> naicsCodes;
	private boolean publicIndicator;
	private String stockExchange;
	private String tickerSymbol;
	private boolean nonProfitIndicator;
	private int yearsOnFile;
	private String stateOfIncorporation;
	private String dateOfIncorporation;
	private String businessType;
	private int employeeSize;
	private String employeeSizeCode;
	private int salesRevenue;
	private String salesSizeCode;
	private Fortune1000Result fortune1000;
	private String corporateLinkageType;
	private List<ExecutiveInformationResult> executiveInformation;
	
	public int getYearsOnFile() {
		return yearsOnFile;
	}

	public void setYearsOnFile(int yearsOnFile) {
		this.yearsOnFile = yearsOnFile;
	}

	public String getStateOfIncorporation() {
		return stateOfIncorporation;
	}

	public void setStateOfIncorporation(String stateOfIncorporation) {
		this.stateOfIncorporation = stateOfIncorporation;
	}

	public String getDateOfIncorporation() {
		return dateOfIncorporation;
	}

	public void setDateOfIncorporation(String dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public int getEmployeeSize() {
		return employeeSize;
	}

	public void setEmployeeSize(int employeeSize) {
		this.employeeSize = employeeSize;
	}

	public String getEmployeeSizeCode() {
		return employeeSizeCode;
	}

	public void setEmployeeSizeCode(String employeeSizeCode) {
		this.employeeSizeCode = employeeSizeCode;
	}

	public int getSalesRevenue() {
		return salesRevenue;
	}

	public void setSalesRevenue(int salesRevenue) {
		this.salesRevenue = salesRevenue;
	}

	public String getSalesSizeCode() {
		return salesSizeCode;
	}

	public void setSalesSizeCode(String salesSizeCode) {
		this.salesSizeCode = salesSizeCode;
	}

	
	

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	public boolean isNonProfitIndicator() {
		return nonProfitIndicator;
	}

	public void setNonProfitIndicator(boolean nonProfitIndicator) {
		this.nonProfitIndicator = nonProfitIndicator;
	}
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}

	public List<NaicsCodesResult> getNaicsCodes() {
		return naicsCodes;
	}

	public void setNaicsCodes(List<NaicsCodesResult> naicsCodes) {
		this.naicsCodes = naicsCodes;
	}

	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}

	public boolean isPublicIndicator() {
		return publicIndicator;
	}

	public void setPublicIndicator(boolean publicIndicator) {
		this.publicIndicator = publicIndicator;
	}

	public List<SicCodesResult> getSicCodes() {
		return sicCodes;
	}

	public void setSicCodes(List<SicCodesResult> sicCodes) {
		this.sicCodes = sicCodes;
	}

	public Fortune1000Result getFortune1000() {
		return fortune1000;
	}

	public void setFortune1000(Fortune1000Result fortune1000) {
		this.fortune1000 = fortune1000;
	}

	public String getCorporateLinkageType() {
		return corporateLinkageType;
	}

	public void setCorporateLinkageType(String corporateLinkageType) {
		this.corporateLinkageType = corporateLinkageType;
	}

	public List<ExecutiveInformationResult> getExecutiveInformation() {
		return executiveInformation;
	}

	public void setExecutiveInformation(List<ExecutiveInformationResult> executiveInformation) {
		this.executiveInformation = executiveInformation;
	}
	
	

}
