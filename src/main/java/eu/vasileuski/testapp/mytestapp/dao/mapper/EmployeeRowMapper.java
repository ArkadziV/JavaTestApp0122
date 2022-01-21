package eu.vasileuski.testapp.mytestapp.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import eu.vasileuski.testapp.mytestapp.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getLong("employee_id"));
		employee.setFirstName(rs.getString("first_name"));
		employee.setLastName(rs.getString("last_name"));
		employee.setDepartmentId(rs.getLong("department_id"));
		employee.setJobTitle(rs.getString("job_title"));
		employee.setGender(rs.getString("gender"));
		employee.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());

		return employee;
	}

}
