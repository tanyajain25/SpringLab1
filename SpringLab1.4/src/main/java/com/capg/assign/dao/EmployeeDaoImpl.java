package com.capg.assign.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.capg.assign.bean.Employee;
@Component
public class EmployeeDaoImpl implements EmployeeDao
{
	private Map<Integer, Employee> map = new HashMap<Integer, Employee>();

	public EmployeeDaoImpl()
	{
		map.put(100, new Employee(100,"Rama",12345.67));
		map.put(101, new Employee(101,"Ramesh",12333.67));
	}

	public Employee findEmployee(int id)
	{
		Employee e =map.get(id);
        return e;	
    
	}

	@Override
	public String toString() {
		return "EmployeeDaoImpl [map=" + map + "]";
	}
	
	
	
}
