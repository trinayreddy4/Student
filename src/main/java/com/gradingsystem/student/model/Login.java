package com.gradingsystem.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
	
	public Login(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public Login() {
		super();
	}
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Id
	private String username;
	private String password;
	private String role;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
