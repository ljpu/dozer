package com.example.howtodoinjava.dozer.converters;

public class SourceObject {
	
	private String fullname;

	public SourceObject() {
		super();
	}

	public SourceObject(String fullname) {
		super();
		this.fullname = fullname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Override
	public String toString() {
		return "SourceObject [fullname=" + fullname + "]";
	}
}
