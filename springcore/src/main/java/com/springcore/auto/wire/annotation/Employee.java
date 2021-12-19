package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int empId;

	private String empName;

	/*
	 * @Autowired
	 * 
	 * @Qualifier("sal1")
	 */
	private Salary sal;

	@Autowired
	/*
	 * We can't use @Qualifier above constructor
	 */
	public Employee(int empId, String empName, @Qualifier("sal1") Salary sal) {
		super();
		System.out.println("Inside constructor");
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	public Employee() {
		super();
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

	/* @Autowired */
	/* @Qualifier("sal1") */
	public void setSal(Salary sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}

}
