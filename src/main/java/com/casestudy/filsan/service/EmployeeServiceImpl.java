package com.casestudy.filsan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.casestudy.filsan.dao.EmployeeDAO;
import com.casestudy.filsan.model.Employee;
import com.casestudy.filsan.repository.EmployeeRepository;

	@Service
	public class EmployeeServiceImpl implements EmployeeService {

		private EmployeeDAO employeeDAO;
		
		@Autowired
		public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
			employeeDAO = theEmployeeDAO;
		}
		
		@Override
		@Transactional
		public List<Employee> findAll() {
			return employeeDAO.findAll();
		}

		@Override
		@Transactional
		public Employee findById(int theId) {
			return employeeDAO.findById(theId);
		}

		@Override
		@Transactional
		public void saveEmployee(Employee theEmployee) {
			employeeDAO.save(theEmployee);
		}

		@Override
		@Transactional
		public void deleteById(int theId) {
			employeeDAO.deleteById(theId);
		}

//	@Override
//	public Employee getEmployee(int id) {
//		Optional<Employee> optional = employeeRepository.findB(id);
//		Employee employee = null;
//		if (optional.isPresent()) {
//			employee = optional.get();
//		} else {
//			throw new RuntimeException(" Employee not found for id :: " + id);
//		}
//		return employee;
//	}

//	@Override
//	public void deleteEmployee(int id) {
//		this.employeeRepository.deleteEmployee(id);
//	}

//	@Override
//	public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
//		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
//			Sort.by(sortField).descending();
//		
//		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
//		return this.employeeRepository.findAll(pageable);
//	}

	
}
