package com.example.howtodoinjava.dozer.annotations;

import java.util.ArrayList;
import java.util.List;

public class DestinationObject {
	
	private String name;
	private String address;
	List<StudentVO> pupils;

	public List<StudentVO> getPupils() {
		if(pupils == null) {
			pupils = new ArrayList<StudentVO>();
		}
		return pupils;
	}

	public void setPupils(List<StudentVO> pupils) {
		this.pupils = pupils;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DestinationObject [name=" + name + ", address=" + address + ", pupils=" + pupils + "]";
	}

	
}

