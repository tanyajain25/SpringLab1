package com.capg.assign.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.assign.bean.Employee;
import com.capg.assign.config.JavaConfig;
import com.capg.assign.dao.EmployeeDao;
import com.capg.assign.dao.EmployeeDaoImpl;
import com.capg.assign.service.EmployeeService;
import com.capg.assign.service.EmployeeServiceImpl;

public class MainRunner 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		Class configurationClass = JavaConfig.class;
		context.register(configurationClass);
	    context.refresh();
	    EmployeeDao dao = context.getBean(EmployeeDao.class);
	    EmployeeService service = context.getBean(EmployeeService.class);
	    System.out.println("Enter Employee Id");
	    int id= sc.nextInt();
	    Employee e = service.findEmployee(id);
	    System.out.println("Employee Details are-");
	    System.out.println("Employee Id"+" "+e.getEmployeeId());
	    System.out.println("Employee Name"+" "+e.getEmployeeName());
	    System.out.println("Employee Salary"+" "+e.getSalary()); 
	
	}

}
