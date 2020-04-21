package com.capg.assign.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.assign.bean.Employee;
//@Component
public class PrintEmployeeDetails 
{

	private Employee employeeObj;

	public PrintEmployeeDetails()
	{
	}
	
	public Employee getEmployee() {
		return employeeObj;
	}

	@Autowired
	public void setEmployee(Employee employeeObj) {
		this.employeeObj = employeeObj;
	}
	
	public void printDetails()
	{
		System.out.println("Employee Details");
		System.out.println("------------");
		System.out.println("Employee Id:");
		System.out.println(employeeObj.getEmployeeId());
		System.out.println("Employee Name:");
		System.out.println(employeeObj.getEmployeeName());
		System.out.println("Employee Salary:");
		System.out.println(employeeObj.getSalary());
		System.out.println("Employee BU:");
		System.out.println(employeeObj.getBusinessUnit());
		System.out.println("Employee Age:");
		System.out.println(employeeObj.getAge());
	}
	
}
