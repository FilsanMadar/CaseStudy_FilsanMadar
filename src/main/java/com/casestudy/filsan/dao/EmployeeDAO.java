package com.casestudy.filsan.dao;

import java.util.List;

import com.casestudy.filsan.model.Employee;



public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
