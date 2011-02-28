package com.wrp.roofmap.model;

import com.wrp.roofmap.util.annotation.PrimaryKey;

public class AdminSettings {
	
	@PrimaryKey
	private Integer id;
	
	private String address;
	private String lat;
	private String lon;
	private String defaultZoom;
	
	public AdminSettings () {
		
	}
	
	public AdminSettings(String address, String lat, String lon, String defaultZoom) {
		this.address = address;
		this.lat = lat;
		this.lon = lon;
		this.defaultZoom = defaultZoom;
	}

	public Integer getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}

	public String getLat() {
		return lat;
	}

	public String getLon() {
		return lon;
	}

	public String getDefaultZoom() {
		return defaultZoom;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public void setDefaultZoom(String defaultZoom) {
		this.defaultZoom = defaultZoom;
	}
	
	public static AdminSettings getDefaultAdminSettings() {
		return new AdminSettings("","40.734039", "-73.99425", "16");
	}
}
