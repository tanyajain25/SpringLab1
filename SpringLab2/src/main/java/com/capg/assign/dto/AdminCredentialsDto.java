package com.capg.assign.dto;

import org.springframework.beans.factory.annotation.Value;

public class AdminCredentialsDto 
{
	//@Value("${name}")
	private String name;
	
	//@Value("${password}")
	private String password;

	public AdminCredentialsDto() {
		super();
	}

	public AdminCredentialsDto(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
