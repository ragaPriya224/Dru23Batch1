package com.demo.entity;

public class Topic {
	private String id; 

	private String name; 

	private String description;

	private int age;
	
	public Topic() {
		
	}


	public Topic(String id, String name, String description, int age) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String description) {
		this.description = description;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
	
	
}
