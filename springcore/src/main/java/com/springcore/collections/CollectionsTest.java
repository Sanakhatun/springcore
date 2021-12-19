package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionsconfig.xml");
		Employee employee = (Employee) context.getBean("employee1");
		
		System.out.println("Employee Details : " + employee);
		System.out.println("ID : " + employee.getEmpName());
		System.out.println("Name : " + employee.getEmpName());
		System.out.println("Phones : " + employee.getPhones());
		System.out.println("Addresses : " + employee.getAddresses());
		System.out.println("Courses : " + employee.getCourses());
		
	}

}