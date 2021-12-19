package com.springcore.auto.wire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/xml/autoconfig.xml");
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println("Auto wiring using byType: " + employee);
		
		Employee employee1 = context.getBean("emp1", Employee.class);
		System.out.println("Auto wiring using byName: " + employee1);
		
		Employee employee2 = context.getBean("emp2", Employee.class);
		System.out.println("Auto wiring using constructor: " + employee2);
		
	}

}
