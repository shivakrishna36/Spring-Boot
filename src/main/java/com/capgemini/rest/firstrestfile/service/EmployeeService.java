package com.capgemini.rest.firstrestfile.service;

import java.util.List;

import com.capgemini.rest.firstrestfile.entity.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);
	
	List<Employee> getAllEmployees( );

	void updateEmployee(Employee employee);
}
