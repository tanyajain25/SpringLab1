package com.capg.assign.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.assign.bean.Employee;
import com.capg.assign.bean.SBU;
import com.capg.assign.config.JavaConfig;
import com.capg.assign.utility.PrintEmployeeDetails;

public class MainRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		Class configurationClass = JavaConfig.class;
		context.register(configurationClass);
		context.refresh();
		System.out.println("---------");

		Employee employeeObj = context.getBean(Employee.class);
		SBU s = employeeObj.getSbuDetails();
		System.out.println("---------");
		PrintEmployeeDetails p = context.getBean(PrintEmployeeDetails.class);
		System.out.println(p);
	}
	
}
