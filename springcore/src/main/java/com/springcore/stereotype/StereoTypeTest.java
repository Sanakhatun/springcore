package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotype_config.xml");
		Student student = context.getBean("student", Student.class);
//		Student student = context.getBean("stud", Student.class);
		System.out.println(student);
		
		System.out.println("Address List: " + student.getAddressList().getClass().getName());

	}

}
