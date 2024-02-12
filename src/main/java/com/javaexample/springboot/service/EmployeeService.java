package com.javaexample.springboot.service;

import java.util.List;

import com.javaexample.springboot.Employee;
import com.javaexample.springboot.EmployeeWithDepartment;

public interface EmployeeService {
	
    Employee getEmployeeById(Integer id);
    
    List<Employee> getAllEmployees();
    
    void saveEmployee(Employee employee);
    
    void deleteEmployee(Integer id);

	List<EmployeeWithDepartment> getAllEmployeesWithDepartment();


}


