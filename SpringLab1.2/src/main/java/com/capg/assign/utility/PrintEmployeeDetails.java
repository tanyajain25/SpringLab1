package com.capg.assign.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.assign.bean.Employee;

@Component
public class PrintEmployeeDetails 
{
	private Employee employeeObj;

	
	public Employee getEmployee() {
		return employeeObj;
	}
	
	@Autowired
	public void setEmployee(Employee employeeObj) {
		this.employeeObj = employeeObj;
	}
		
	@Override
	public String toString() {
		return "PrintEmployeeDetails [Employee Details-- Employee Id:" + employeeObj.getEmployeeId()+ " Employee Name:"+ 
		employeeObj.getEmployeeName()+ " Employee Salary:"+employeeObj.getSalary()+ " Employee Age:"+ employeeObj.getAge();
	}

	
}
