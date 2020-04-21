package com.capg.assign.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.assgn.config.JavaConfig;
import com.capg.assign.bean.Employee;
import com.capg.assign.display.PrintEmployeeDetails;
import com.capg.assgn.config.*;
public class MainRunner
{

	public static void main(String[] args) 
	{
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
        Class configurationClass=JavaConfig.class;
        context.register(configurationClass);
        context.refresh();
       	System.out.println("---------");
		//Employee employeeObj = context.getBean(Employee.class);
     	PrintEmployeeDetails obj = context.getBean(PrintEmployeeDetails.class);
		obj.printDetails();
		
	}
}
