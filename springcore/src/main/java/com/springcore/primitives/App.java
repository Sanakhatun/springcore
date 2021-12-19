package com.springcore.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		/**
		 * Step2: Traditional way to create Object
		 */

		Student studObj = new Student();
		studObj.setStudentId(10000);
		studObj.setStudentName("traditional Object");
		studObj.setStudentAddress("Sakinaka");
		System.out.println("--------Manual Object Creation:--------------\n" + studObj);

		System.out.println("Hello World!");

		/*
		 * Here, we're not creating the Student object explicitly, it's done by IOC
		 * Container ApplicationContext represents IOC Container
		 */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) applicationContext.getBean("student1");
		Student student2 = (Student) applicationContext.getBean("students");
		Student student3 = (Student) applicationContext.getBean("stud");

		System.out.println("-----------Spring Framework Dependency Injection--------------");
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);

	}
}
