package com.wrp.roofmap.model;



import java.util.ArrayList;
import java.util.Date;

import com.wrp.roofmap.util.annotation.ListType;
import com.wrp.roofmap.util.annotation.PersistentObject;
import com.wrp.roofmap.util.annotation.PrimaryKey;

public class MapEntry {
	@PrimaryKey
	private Integer id;
	
	private String contactName;
	private String contactEmail;
	
	private Date modified;
	
	@PersistentObject
	private Building building;
	
	@PersistentObject
	@ListType(Person.class)
	private ArrayList<Person> contacts;
	
	public MapEntry() {
		
	}
	
	public MapEntry(String contactName, String contactEmail, Date modified, Building building,
			ArrayList<Person> contacts) {
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.id = -1;
		this.modified = modified;
		this.building = building;
		this.contacts = contacts;
	}

	public MapEntry(Integer id, String contactName, String contactEmail, Date modified, Building building,
			ArrayList<Person> contacts) {
		this.id = id;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.modified = modified;
		this.building = building;
		this.contacts = contacts;
	}

	public Integer getId() {
		return id;
	}
	
	public String getContactName() {
		return contactName;
	}
	
	public String getContactEmail() {
		return contactEmail;
	}

	public Date getModified() {
		return modified;
	}

	public Building getBuilding() {
		return building;
	}

	public ArrayList<Person> getContacts() {
		return contacts;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public void setContacts(ArrayList<Person> contacts) {
		this.contacts = contacts;
	}
}
