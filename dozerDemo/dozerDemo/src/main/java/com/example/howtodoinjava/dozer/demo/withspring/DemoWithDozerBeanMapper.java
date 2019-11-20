package com.example.howtodoinjava.dozer.demo.withspring;

import org.dozer.DozerBeanMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.howtodoinjava.dozer.models.DestinationObject;
import com.example.howtodoinjava.dozer.models.SourceObject;
import com.example.howtodoinjava.dozer.models.Student;

public class DemoWithDozerBeanMapper {

	public static void main(String[] args) {
		SourceObject sourceObject = new SourceObject();
		sourceObject.setName("Sajal");
		sourceObject.setAddress("India");

		sourceObject.getStudents().add(new Student("S1", "C1", "diffField1"));
		sourceObject.getStudents().add(new Student("S2", "C2", "diffField2"));
		sourceObject.getStudents().add(new Student("S3", "C3", "diffField3"));

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		DozerBeanMapper beanMapper = (DozerBeanMapper) applicationContext.getBean("dozerBeanMapper");
		DestinationObject destinationObject = beanMapper.map(sourceObject, DestinationObject.class);
		
		System.out.println(destinationObject);
	}
}
