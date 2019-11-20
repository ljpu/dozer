package com.example.howtodoinjava.dozer.api;

import java.util.Date;

public class DestinationObject {
	
	Date date;

	public DestinationObject() {
		super();
	}

	@Override
	public String toString() {
		return "DestinationObject [date=" + date + "]";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
