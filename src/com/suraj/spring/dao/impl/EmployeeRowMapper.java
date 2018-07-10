package com.suraj.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.suraj.spring.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(resultSet.getInt("employee_id"));
		employee.setEmpoyeeName(resultSet.getString("employee_name"));
		employee.setEmail(resultSet.getString("email"));
		employee.setSalary(resultSet.getDouble("sal"));
		employee.setDeptNum(resultSet.getInt("dept_no"));
		return employee;
	}

}
