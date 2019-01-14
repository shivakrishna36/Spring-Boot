package com.capgemini.rest.firstrestfile.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.rest.firstrestfile.entity.Employee;
import com.capgemini.rest.firstrestfile.service.EmployeeService;

@RestController
@RequestMapping("/employees")

public class EmployeeResource {

	@Autowired
	EmployeeService service;
	
	@PostMapping
	public void addNewEmployee(@RequestBody Employee employee)
	{
		service.addNewEmployee(employee);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@PutMapping("{empId}")
	public void updateEmployee(@PathVariable("empId") String empId, @RequestBody Employee employee)
	{
		employee.setEmpId(empId);
		service.updateEmployee(employee);
	}
	
}
