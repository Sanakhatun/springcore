package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/standalone_config.xml");

		Person person = context.getBean("person", Person.class);
		System.out.println(person.getFriendList());
		System.out.println("Type of Standalone Collection:" + person.getFriendList().getClass().getName());
		
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println("HashMap" + person.getPincodeMap());
		System.out.println("Type of Standalone Colection: " + person.getPincodeMap().getClass().getName());
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Database Properties" + person.getProperties());
		System.out.println("Type of Standalone Colection: " + person.getProperties().getClass().getName());
		
		
	}

}
