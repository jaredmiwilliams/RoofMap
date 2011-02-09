package com.wrp.roofmap.model;



import java.util.ArrayList;
import java.util.Date;

import com.wrp.roofmap.util.annotations.ListType;
import com.wrp.roofmap.util.annotations.PersistentObject;
import com.wrp.roofmap.util.annotations.PrimaryKey;

public class MapEntry {
	@PrimaryKey
	private Integer id;
	
	private Date modified;
	
	@PersistentObject
	private Building building;
	
	@PersistentObject
	@ListType(Person.class)
	private ArrayList<Person> contacts;
	
	public MapEntry() {
		
	}
	
	public MapEntry(Date modified, Building building,
			ArrayList<Person> contacts) {
		this.id = -1;
		this.modified = modified;
		this.building = building;
		this.contacts = contacts;
	}

	public MapEntry(Integer id, Date modified, Building building,
			ArrayList<Person> contacts) {
		this.id = id;
		this.modified = modified;
		this.building = building;
		this.contacts = contacts;
	}

	public Integer getId() {
		return id;
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
