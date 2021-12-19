package com.springcore.auto.wire.xml;

import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int empId;

	private String empName;

	private Salary sal;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, Salary sal) {
		super();
		System.out.println("Inside constructor");
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

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

	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}

}
