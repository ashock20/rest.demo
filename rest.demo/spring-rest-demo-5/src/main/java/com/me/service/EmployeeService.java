package com.me.service;

import java.util.List;

import com.me.entity.Employee;
import com.me.exception.EmployeeNotFoundException;

public interface EmployeeService {
	public Employee registerEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee deleteEmployee(int empid) throws EmployeeNotFoundException;
	public Employee getEmployee(int empid) throws EmployeeNotFoundException;
	public List<Employee> getEmployees();
}