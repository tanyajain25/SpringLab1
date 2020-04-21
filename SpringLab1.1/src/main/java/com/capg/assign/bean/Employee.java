package com.capg.assign.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	 //@Value("101")
	 @Value("${employeeId}")
	private int employeeId;
	 
	 //@Value("name")
	 @Value("${employeeName}")
	private String employeeName;
	
	 //@Value("1000")
	 @Value("${salary}")
	private double salary;
	 
	 //@Value("bu")
	 @Value("${businessUnit}")
	private String businessUnit;
	 
	 //@Value("50")
	 @Value("${age}")
	private int age;
	
	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}
	
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
