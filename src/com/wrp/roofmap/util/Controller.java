package com.wrp.roofmap.util;

import java.sql.SQLException;
import java.util.ArrayList;

import com.wrp.roofmap.model.AdminSettings;
import com.wrp.roofmap.model.MapEntry;
import com.wrp.roofmap.model.User;

public class Controller {
	private static Connect connect = null;
	private static Controller controller = null;
	
	public static Connect getConnect() {
		if(connect == null) {
			connect = new Connect();
		}
		return connect;
	}
	
	public static Controller getInstance() {
		if(controller == null) {
			controller = new Controller();
		}
		return controller;
	}
	
	private Controller() {
		
	}
	
	public boolean addAdminSettings(AdminSettings settings) {
		return getConnect().persist(settings);
	}
	
	@SuppressWarnings("unchecked")
	public AdminSettings getAdminSettings() {
		ArrayList<AdminSettings> settings = new ArrayList<AdminSettings>();
		try {
			settings = (ArrayList<AdminSettings>)getConnect().getObjects(AdminSettings.class);
			
			if(settings != null && !settings.isEmpty()) {
				return settings.get(0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return AdminSettings.getDefaultAdminSettings();
	}
	
	public boolean deleteAdminSettings(String id) {
		return getConnect().deleteObjectById(AdminSettings.class, "id", id);
	}
	
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
