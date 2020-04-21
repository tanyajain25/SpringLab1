package com.capg.assgn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.capg.assign.display.PrintEmployeeDetails;

@Configuration
@ComponentScan("com.capg.assign.bean")
@PropertySource("classpath:Employee.properties")
public class JavaConfig 
{
	@Bean
	public PrintEmployeeDetails print()
	{
		PrintEmployeeDetails p = new PrintEmployeeDetails();
		return p;
	}
	
}
