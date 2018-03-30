package com.abhi.spring.jdbc;

public class Book {
	long id;
	String name;
	String authour;

	/*
	 * public Book(long id, String name, String authour) {
	 * 
	 * this.id = id; this.name = name; this.authour = authour; }
	 */

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Book [id=%s, name=%s, authour=%s]", id, name, authour);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthour() {
		return authour;
	}

	public void setAuthour(String authour) {
		this.authour = authour;
	}

}
