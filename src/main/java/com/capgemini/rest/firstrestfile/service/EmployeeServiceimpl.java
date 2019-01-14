package com.capgemini.rest.firstrestfile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.rest.firstrestfile.entity.Employee;
import com.capgemini.rest.firstrestfile.repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public void addNewEmployee(Employee employee)
	{
		repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		repository.save(employee);
	}
}
