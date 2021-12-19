package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/auto/wire/annotation/autoconfig.xml");

		Employee employee = context.getBean("emp", Employee.class);
		System.out.println("Auto wiring using Annotation: " + employee);

		/*
		 * Employee employee2 = context.getBean("emp", Employee.class);
		 * System.out.println("Auto wiring using constructor: " + employee2);
		 */

	}

}
