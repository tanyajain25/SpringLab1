package com.capg.assign.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.assign.bean.Employee;
import com.capg.assign.bean.SBU;

@Component
public class UtilityClass 
{
	private Employee employee;
	private SBU sbu;

	public UtilityClass() {
		super();
	}

	public SBU getSbu() {
		return sbu;
	}

	@Autowired
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
		
	public Employee getEmployee() {
		return employee;
	}
	
	@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void insertValues()
	{		
		sbu.getEmpList().add(employee);
		Employee e = new Employee(12346,"Sam",40000,30);
		sbu.getEmpList().add(e);
		
	}
		
}
	
	
	

