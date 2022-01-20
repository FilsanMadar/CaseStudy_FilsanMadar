package com.casestudy.filsan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.filsan.model.Employee;
import com.casestudy.filsan.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	@GetMapping("/employees")
    public List<Employee> list(){
        return employeeService.findAll();
    }
	
	// add mapping for GET /customers/{customerId}
	
		@GetMapping("/employee/{employeeId}")
		public Employee getEmployee(@PathVariable int employeeId) {
			
			Employee theEmployee = employeeService.findById(employeeId);
			
			
			return theEmployee;
		}
		
		// add mapping for POST /customers  - add new customer
		
		@PostMapping("/employees")
		public Employee addEmployee(@RequestBody Employee theEmployee) {
			
			// also just in case the pass an id in JSON ... set id to 0
			// this is force a save of new item ... instead of update
			
			theEmployee.setId(0);
			
			employeeService.saveEmployee(theEmployee);
			
			return theEmployee;
		}
		
		// add mapping for PUT /customers - update existing customer
		
		@PutMapping("/employees")
		public Employee updateEmployee(@RequestBody Employee theEmployee) {
			
			employeeService.saveEmployee(theEmployee);
			
			return theEmployee;
			
		}
		
		// add mapping for DELETE /customers/{customerId} - delete customer
		
		@DeleteMapping("/employee/{employeeId}")
		public String deleteEmployee(@PathVariable int employeeId) {
			
			Employee tempEmployee = employeeService.findById(employeeId);
			
					
			employeeService.deleteById(employeeId);
			
			return "Deleted customer id - " + employeeId;
		}
}
		

	
