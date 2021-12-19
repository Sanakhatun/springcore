package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int empId;

	private String empName;

	private List<String> phones;

	private Set<String> addresses;

	private Map<String, String> courses; // Courses took by employees and duration

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", phones=" + phones + ", addresses=" + addresses
				+ ", courses=" + courses + "]";
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

}
