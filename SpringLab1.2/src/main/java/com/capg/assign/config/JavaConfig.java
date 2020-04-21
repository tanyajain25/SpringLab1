package com.capg.assign.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.capg.assign")
@PropertySource("classpath:Employee.properties")
@PropertySource("classpath:Sbu.properties")
public class JavaConfig 
{

}
