package com.wrp.roofmap.model;

import com.wrp.roofmap.util.annotation.ForeignKey;


public class Person {
	private String name;
	private String email;
	private String phone;
	
	@ForeignKey(MapEntry.class)
	private Integer mapEntryId;
	
	public Person() {
		this.name = "";
		this.email = "";
		this.phone = "";
		this.mapEntryId = -1;
	}
	
	public Person(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.mapEntryId = -1;
	}
	
	public Person(String name, String email, String phone, int mapEntryId) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.mapEntryId = mapEntryId;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public Integer getMapEntryId() {
		return mapEntryId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setMapEntryId(int mapEntryId) {
		this.mapEntryId = mapEntryId;
	}
	
	
}
