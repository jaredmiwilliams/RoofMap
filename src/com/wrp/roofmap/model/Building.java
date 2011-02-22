package com.wrp.roofmap.model;

import com.wrp.roofmap.util.annotation.ForeignKey;

public class Building {
	private String buildingName;
	private String buildingType;
	private String roofType;
    
	private String addr;
	private String city;
	private String state;
	private String zip;
    private String country;
    private String formattedAddress;
    
    private Boolean knownOwner;
    
    private String datePainted;
    private Boolean temperatureMonitor;
    
    private String lat;
    private String lon;
    
	@ForeignKey(MapEntry.class)
    private Integer mapEntryId;
    
    public Building() {
    	
    }
    
    public Building(String buildingName, String buildingType, String roofType,
			String addr, String city, String state, String zip, String country,
			String formattedAddress, boolean knownOwner, String datePainted, boolean temperateMonitor,
			String lat, String lon) {
		this.buildingName = buildingName;
		this.buildingType = buildingType;
		this.roofType = roofType;
		this.addr = addr;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.formattedAddress = formattedAddress;
		this.knownOwner = knownOwner;
		this.datePainted = datePainted;
		this.temperatureMonitor = temperateMonitor;
		this.lat = lat;
		this.lon = lon;
		this.mapEntryId = -1;
	}

	public Building(String buildingName, String buildingType, String roofType,
			String addr, String city, String state, String zip, String country,
			String formattedAddress, boolean knownOwner, String datePainted, boolean temperateMonitor,
			String lat, String lon, Integer mapEntryId) {
		this.buildingName = buildingName;
		this.buildingType = buildingType;
		this.roofType = roofType;
		this.addr = addr;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.formattedAddress = formattedAddress;
		this.knownOwner = knownOwner;
		this.datePainted = datePainted;
		this.temperatureMonitor = temperateMonitor;
		this.lat = lat;
		this.lon = lon;
		this.mapEntryId = mapEntryId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public String getRoofType() {
		return roofType;
	}

	public String getAddr() {
		return addr;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	public String getFormattedAddress() {
		return formattedAddress;
	}
	
	public Boolean getKnownOwner() {
		return knownOwner;
	}
	
	public String getDatePainted() {
		return datePainted;
	}
	
	public Boolean getTemperatureMonitor() {
		return temperatureMonitor;
	}

	public String getLat() {
		return lat;
	}

	public String getLon() {
		return lon;
	}

	public Integer getMapEntryId() {
		return mapEntryId;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public void setRoofType(String roofType) {
		this.roofType = roofType;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	
	public void setKnownOwner(boolean knownOwner) {
		this.knownOwner = knownOwner;
	}
	
	public void setKnownOwner(String knownOwner) {
		this.knownOwner = Boolean.parseBoolean(knownOwner);
	}
	
	public void setDatePainted(String datePainted) {
		this.datePainted = datePainted;
	}
	
	public void setTemperatureMonitor(boolean temperatureMonitor) {
		this.temperatureMonitor = temperatureMonitor;
	}
	
	public void setTemperatureMonitor(String temperatureMonitor) {
		this.temperatureMonitor = Boolean.parseBoolean(temperatureMonitor);
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public void setMapEntryId(Integer mapEntryId) {
		this.mapEntryId = mapEntryId;
	}
    
    
}
