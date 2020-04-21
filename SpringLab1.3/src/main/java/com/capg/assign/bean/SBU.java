package com.capg.assign.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU 
{
	@Value("${sbuId}")
	private String sbuId;
	
	@Value("${sbuName}")
	private String sbuName;
	
	@Value("${sbuHead}")
	private String sbuHead;
	
	private List<Employee> empList;
	
	public SBU() {
		super();
		}
	
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	public List<Employee> getEmpList() {
		return empList;
	}
	@Autowired
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
	
}
