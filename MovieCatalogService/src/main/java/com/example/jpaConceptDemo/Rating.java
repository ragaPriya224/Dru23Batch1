package com.example.jpaConceptDemo;

public class Rating {
	private String moveiId;
	private int rating;
	
	public Rating() {
	}
	public Rating(String moveiId, int rating) {
		super();
		this.moveiId = moveiId;
		this.rating = rating;
	}
	public String getMoveiId() {
		return moveiId;
	}
	public void setMoveiId(String moveiId) {
		this.moveiId = moveiId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
