package com.springcore.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferencesTest {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/references/referencesconfig.xml");
		User user = (User) context.getBean("userRef");

		System.out.println("User1: " + user);
		System.out.println("User Id: " + user.getUserId());
		System.out.println("Username: " + user.getUsername());
		System.out.println("Email Address: " + user.getEmailAddress());
		System.out.println("Address: " + user.getAddress());

		User user2 = (User) context.getBean("userRef1");
		System.out.println("User2: " + user2);
		User user3 = (User) context.getBean("userRef2");
		System.out.println("User3: " + user3);

	}

}
