package org.java.entity;

import java.io.Serializable;

public class User implements Serializable {
	private Integer uid;
	private String name;
	private String password;
	private Integer type;
	public User() {
		super();
	}
	public User(Integer uid, String name, String password, Integer type) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.type = type;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
}
