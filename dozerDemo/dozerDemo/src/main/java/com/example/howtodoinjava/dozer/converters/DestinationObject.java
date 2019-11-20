package com.example.howtodoinjava.dozer.converters;

public class DestinationObject {
	private String fullname;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Override
	public String toString() {
		return "DestinationObject [fullname=" + fullname + "]";
	}

	public DestinationObject(String fullname) {
		super();
		this.fullname = fullname;
	}

	public DestinationObject() {
		super();
	}

}
