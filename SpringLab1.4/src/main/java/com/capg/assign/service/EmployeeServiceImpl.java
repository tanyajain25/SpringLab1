package com.capg.assign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.assign.bean.Employee;
import com.capg.assign.dao.EmployeeDao;

@Component
public class EmployeeServiceImpl implements EmployeeService
{

	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public Employee findEmployee(int id)
	{
		Employee e =employeeDao.findEmployee(id);
		return e;
	}

	@Override
	public String toString() {
		return "EmployeeServiceImpl [employeeDao=" + employeeDao + "]";
	}
	
	
}
