package com.springcore.ci;

import java.util.List;

public class Person {

	private int personId;

	private String name;

	private int age;

	private Certificate cert;
	
	private List<String> addressList;

	public Person(int personId, String name, Certificate certificate, List<String> addressList) {
		super();
		this.personId = personId;
		this.name = name;
		cert = certificate;
		this.addressList = addressList;
	}

	/*
	 * public Person(int personId, int age, Certificate certificate) { super();
	 * this.personId = personId; this.age = age; cert = certificate; }
	 */
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", certificate Id ="
				+ cert.certId + ", certificate name =" + cert.name + "]";
	}

}
