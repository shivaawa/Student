package com.javaexample.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaexample.springboot.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByName(String name);




}
