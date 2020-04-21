package com.capg.assign.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	@Value("${employeeId}")
	private int employeeId;
	
	@Value("${employeeName}")
	private String employeeName;
	
	@Value("${salary}")
	private double salary;
	
	@Value("${age}")
	private int age;
	
	private SBU businessUnit;
	
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
	public SBU getBusinessUnit() {
		return businessUnit;
	}	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Autowired
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	public SBU getSbuDetails()
	{
		System.out.println("Id-" +" "+ businessUnit.getSbuId());
		System.out.println("Name-" +" "+ businessUnit.getSbuName());
		System.out.println("Head-" +" "+ businessUnit.getSbuHead());
		return businessUnit;
	}
	
	
}
