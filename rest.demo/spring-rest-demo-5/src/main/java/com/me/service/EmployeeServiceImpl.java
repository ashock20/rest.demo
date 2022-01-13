package com.me.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.dao.EmployeeRepository;
import com.me.entity.Employee;
import com.me.exception.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee registerEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public Employee deleteEmployee(int empid)  throws EmployeeNotFoundException{
		Optional<Employee> employee = empRepo.findById(empid);
		
		Employee emp = null;
		if(employee.isPresent()) {
			empRepo.deleteById(empid);
			emp = employee.get();
		}else {
			throw new EmployeeNotFoundException("No such employee");
		}
		return emp;
	}

	@Override
	public Employee getEmployee(int empid)  throws EmployeeNotFoundException{
		Optional<Employee> employee = empRepo.findById(empid);
		Employee emp = null;
		if(employee.isPresent()) {
			emp = employee.get();
		}else {
			throw new EmployeeNotFoundException("No such employee");
		}
		return emp;
	}

	@Override
	public List<Employee> getEmployees() {
		return empRepo.findAll();
	}
}