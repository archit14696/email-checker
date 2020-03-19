package com.example.simplerestapis.models;

public class PostResponse {
	
	String message;
	int numOfLists;
	public int getnumOfLists() {
		return numOfLists;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setnumOfLists(int numOfLists) {
		this.numOfLists = numOfLists;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}