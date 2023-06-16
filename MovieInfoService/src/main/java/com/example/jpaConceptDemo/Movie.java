package com.example.jpaConceptDemo;

public class Movie {
	private String moveiId;
	private String name;
	public Movie() {
	}
	public Movie(String moveiId, String name) {
		super();
		this.moveiId = moveiId;
		this.name = name;
	}
	public String getMoveiId() {
		return moveiId;
	}
	public void setMoveiId(String moveiId) {
		this.moveiId = moveiId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
