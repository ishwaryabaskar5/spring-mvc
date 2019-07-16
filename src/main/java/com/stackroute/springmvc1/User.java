package com.stackroute.springmvc1;

public class User {
	private String name;
	
	public User() {
		System.out.println("UserConstructor Called");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
