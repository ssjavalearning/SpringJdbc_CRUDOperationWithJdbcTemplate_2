package com.suraj.spring.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.suraj.spring.dao.EmployeeDao;
import com.suraj.spring.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void createEmployee(Employee employee) {
		String SQL = "INSERT INTO employee_table(employee_name,email,sal,dept_no) VALUES(?,?,?,?)";
		int createEmployee = jdbcTemplate.update(SQL,
				new Object[] { employee.getEmpoyeeName(), employee.getEmail(),
						employee.getSalary(), employee.getDeptNum() });
		if (createEmployee > 0) {
			System.out.println("records inserted successfully...");
		}
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return jdbcTemplate.queryForObject(
				"SELECT * FROM employee_table where employee_id=?",
				new EmployeeRowMapper(), employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query("SELECT * FROM employee_table",
				new EmployeeRowMapper());
	}

	@Override
	public void updateEmployeeEmailById(String email, int employeeId) {
		String SQL = "UPDATE employee_table set email = ? WHERE employee_id=?";
		int updateRecord = jdbcTemplate.update(SQL, email, employeeId);
		if (updateRecord > 0) {
			System.out.println("record updated successfully with id::"
					+ employeeId);
		}
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		String SQL = "DELETE FROM employee_table where employee_id=?";
		int deleteRecord = jdbcTemplate.update(SQL, employeeId);
		if (deleteRecord > 0) {
			System.out.println("record deleted successfully with id::"
					+ employeeId);
		}
	}
}
