package com.capg.assign.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.assign.bean.Employee;
import com.capg.assign.bean.SBU;
import com.capg.assign.config.JavaConfig;
import com.capg.assign.utility.UtilityClass;

public class MainClass 
{

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		 
		 Class configurationClass= JavaConfig.class;
	     context.register(configurationClass);
	     context.refresh();
	     
	     Employee employee = context.getBean(Employee.class);
	     SBU sbu = context.getBean(SBU.class);
	     
	     UtilityClass obj = context.getBean(UtilityClass.class);
	     obj.insertValues();
     
	     
	        System.out.println("SBU Details are--");
			System.out.println(sbu.getSbuId()+ sbu.getSbuName()+ sbu.getSbuHead());
			System.out.println("-----------------");
			System.out.println("Employee Details are--");
			System.out.println(sbu.getEmpList());
	     

	     
	}
}
