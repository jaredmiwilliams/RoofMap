package com.wrp.roofmap.util;

import java.sql.SQLException;
import java.util.ArrayList;

import com.wrp.roofmap.model.MapEntry;
import com.wrp.roofmap.model.User;

public class Controller {
	private static Connect connect = null;
	
	public static Connect getConnect() {
		if(connect == null) {
			connect = new Connect();
		}
		return connect;
	}
	
	//TODO settings
	
	@SuppressWarnings("unchecked")
	public ArrayList<MapEntry> getMapEntries() {
		ArrayList<MapEntry> mapEntries = new ArrayList<MapEntry>();
		try {
			mapEntries =  (ArrayList<MapEntry>)getConnect().getObjects(MapEntry.class);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mapEntries;
	}
	
	public boolean addMapEntry(MapEntry mapEntry) {
		return getConnect().persist(mapEntry);
	}
	
	public MapEntry getMapEntry(String id) {
		MapEntry mapEntry = null;
		
		try {
			mapEntry = (MapEntry) getConnect().getObject(MapEntry.class, "id", id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mapEntry;
	}
	
	public boolean deleteMapEntry(String id) {
		return getConnect().deleteObjectById(MapEntry.class, "id", id);
	}
	
	public boolean authorizeUser(String name, String pass) {
		User user = getUser(name);
		
		return user.checkPassword(pass);
	}
	
	public boolean addUser(String name, String pass) {
		User user = new User();
		user.setName(name);
		user.encryptPassword(pass);
		
		return getConnect().persist(user);
	}
	
	public User getUser(String name) {
		User user = null;
		
		try {
			user = (User) getConnect().getObject(User.class, "user", name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public boolean deleteUser(String name) {
		return getConnect().deleteObjectById(User.class, "name", name);
	}
}
