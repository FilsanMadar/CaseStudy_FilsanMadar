package com.casestudy.filsan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.casestudy.filsan.model.Employee;

@Service
@Qualifier("employeeService")
public interface EmployeeService {
//	List<Employee> getAllEmployees();
//	void saveEmployee(Employee employee);
//	Employee getEmployee(int id);
//	void deleteEmployee(int id);
//	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	
public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void saveEmployee(Employee theEmployee);
	
	public void deleteById(int theId);
}
