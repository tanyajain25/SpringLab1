package com.capg.assign.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.capg.assign")
@Scope("prototype")
@PropertySource("classpath:Employee.properties")
@PropertySource("classpath:Sbu.properties")
public class JavaConfig {

}
