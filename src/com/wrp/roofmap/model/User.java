package com.wrp.roofmap.model;

import com.wrp.roofmap.util.BCrypt;

public class User {
	private String name;
	private String hash;
	
	public User() {
		
	}
	
	public User(String name, String hash) {
		this.name = name;
		this.hash = hash;
	}

	public String getName() {
		return name;
	}

	public String getHash() {
		return hash;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public boolean checkPassword(String password) {
		return BCrypt.checkpw(password, hash);
	}
	
	public void encryptPassword(String password) {
		this.hash = BCrypt.hashpw(password, BCrypt.gensalt());
	}
}