package com.example.howtodoinjava.dozer.demo.withoutspring;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;

import com.example.howtodoinjava.dozer.models.DestinationObject;
import com.example.howtodoinjava.dozer.models.SourceObject;
import com.example.howtodoinjava.dozer.models.Student;

public class Demo {

	public static void main(String[] args) 
	{
		
		DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
		SourceObject sourceObject = new SourceObject();
		sourceObject.setName("Sajal");
		sourceObject.setAddress("India");

		sourceObject.getStudents().add(new Student("S1", "C1", "diffField1"));
		sourceObject.getStudents().add(new Student("S2", "C2", "diffField2"));
		sourceObject.getStudents().add(new Student("S3", "C3", "diffField3"));

	 
//		dozerBeanMapper.setMappingFiles(Arrays.asList("mappings\\student-mapper.xml"));  // windows file format
		dozerBeanMapper.setMappingFiles(Arrays.asList("mappings/student-mapper.xml"));   // Unix file format
		DestinationObject destinationObject = dozerBeanMapper.map(sourceObject, DestinationObject.class);
		System.out.println(destinationObject);
	}

}
