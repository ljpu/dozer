package com.example.howtodoinjava.dozer.models;

import java.util.ArrayList;
import java.util.List;

public class SourceObject {

	private String name;
	private String address;
	List<Student> students;
	
	public List<Student> getStudents() {
		if(students == null) {
			students = new ArrayList<Student>();
		}
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
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
		return "SourceObject [name=" + name + ", address=" + address + ", students=" + students + "]";
	}


}


