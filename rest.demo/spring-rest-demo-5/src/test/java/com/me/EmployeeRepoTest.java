package com.me;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.me.entity.Employee;
import com.me.service.EmployeeService;

@SpringBootTest
public class EmployeeRepoTest {
	
	@MockBean
	private EmployeeService employeeService;
	
	@Test
	public void testRegister() {
		Employee employee = new Employee(2,"bvk",300000);
		
		Mockito.when(employeeService.registerEmployee(employee)).thenReturn(employee);
	}
	
	@Test
	public void testGet() {
		Employee employee = new Employee(2,"bvk",300000);
		
		Mockito.when(employeeService.getEmployee(2)).thenReturn(employee);
	}
}