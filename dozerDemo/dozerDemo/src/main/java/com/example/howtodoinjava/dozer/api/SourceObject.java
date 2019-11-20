package com.example.howtodoinjava.dozer.api;

public class SourceObject {
	
	String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public SourceObject(String date) {
		super();
		this.date = date;
	}

	public SourceObject() {
		super();
	}

	@Override
	public String toString() {
		return "SourceObject [date=" + date + "]";
	}
}
