package com.casestudy.filsan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.filsan.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
