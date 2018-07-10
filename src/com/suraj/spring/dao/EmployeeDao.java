package com.suraj.spring.dao;

import java.util.List;

import com.suraj.spring.model.Employee;

public interface EmployeeDao {

	public void createEmployee(Employee employee);
	public Employee getEmployeeById(int employeeId);
	public List<Employee> getAllEmployees();
	public void updateEmployeeEmailById(String email, int employeeId);
	public void deleteEmployeeById(int employeeId);

}
