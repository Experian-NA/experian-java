package com.experian.bis.api.lib.socialmediainsights.bean.response;

public class BusinessGeocodeResult {

	private String latitudeLongitudeLevel;
	private float latitude;
	private float longitude;
	private String msaCode;
	private String censusBlkGrpCode;
	private String censusTractCode;
	private boolean cottageIndicator;
	private String congressionalDistrictCode;
	private String dateLastReported;
	public String getLatitudeLongitudeLevel() {
		return latitudeLongitudeLevel;
	}
	public void setLatitudeLongitudeLevel(String latitudeLongitudeLevel) {
		this.latitudeLongitudeLevel = latitudeLongitudeLevel;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public String getMsaCode() {
		return msaCode;
	}
	public void setMsaCode(String msaCode) {
		this.msaCode = msaCode;
	}
	public String getCensusBlkGrpCode() {
		return censusBlkGrpCode;
	}
	public void setCensusBlkGrpCode(String censusBlkGrpCode) {
		this.censusBlkGrpCode = censusBlkGrpCode;
	}
	public String getCensusTractCode() {
		return censusTractCode;
	}
	public void setCensusTractCode(String censusTractCode) {
		this.censusTractCode = censusTractCode;
	}
	public boolean isCottageIndicator() {
		return cottageIndicator;
	}
	public void setCottageIndicator(boolean cottageIndicator) {
		this.cottageIndicator = cottageIndicator;
	}
	public String getCongressionalDistrictCode() {
		return congressionalDistrictCode;
	}
	public void setCongressionalDistrictCode(String congressionalDistrictCode) {
		this.congressionalDistrictCode = congressionalDistrictCode;
	}
	public String getDateLastReported() {
		return dateLastReported;
	}
	public void setDateLastReported(String dateLastReported) {
		this.dateLastReported = dateLastReported;
	}
	
	
}
