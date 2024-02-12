package com.javaexample.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexample.springboot.Employee;
import com.javaexample.springboot.EmployeeWithDepartment;
import com.javaexample.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<EmployeeWithDepartment> getAllEmployeesWithDepartment() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeWithDepartment> employeesWithDepartment = new ArrayList<>();

        for (Employee employee : employees) {
            EmployeeWithDepartment empWithDept = new EmployeeWithDepartment();
            empWithDept.setEmployeeId(employee.getId());
            empWithDept.setEmployeeName(employee.getName());
            empWithDept.setDepartmentName(employee.getDepartment().getName());

            employeesWithDepartment.add(empWithDept);
        }

        return employeesWithDepartment;
    }
}
