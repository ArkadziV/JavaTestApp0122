package eu.vasileuski.testapp.mytestapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import eu.vasileuski.testapp.mytestapp.dao.mapper.EmployeeRowMapper;
import eu.vasileuski.testapp.mytestapp.entity.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String INSERT = "insert into employee (first_name, last_name, department_id, "
			+ "job_title, gender, date_of_birth) values (?, ?, ?, ?, ?, ?)";
	private static final String UPDATE = "update employee set first_name=?, last_name=?, department_id=?, "
			+ "job_title=?, gender=?, date_of_birth=? where employee_id=?";
	private static final String DELETE = "delete from employee where employee_id=?";

	private static final String GET_BY_ID = "select * from employee where employee_id=?";

	private static final String GET_ALL = "select * from employee";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAll() {
		List<Employee> employees = jdbcTemplate.query(GET_ALL, new EmployeeRowMapper());
		return employees;
	}

	@Override
	public Employee getEmployee(long id) {
		Employee employee = jdbcTemplate.queryForObject(GET_BY_ID, new EmployeeRowMapper(), new Object[] { id });
		return employee;
	}

	@Override
	public int createEmployee(Employee employee) {
		return jdbcTemplate.update(INSERT, employee.getFirstName(), employee.getLastName(),
				employee.getDepartmentId(), employee.getJobTitle(), employee.getGender(),
				java.sql.Date.valueOf(employee.getDateOfBirth()));
	}

	@Override
	public int updateEmployee(Employee employee) {
		return jdbcTemplate.update(UPDATE, employee.getFirstName(), employee.getLastName(),
				employee.getDepartmentId(), employee.getJobTitle(), employee.getGender(),
				java.sql.Date.valueOf(employee.getDateOfBirth()), employee.getEmployeeId());
	}

	@Override
	public int deleteEmployee(long id) {
		return jdbcTemplate.update(DELETE, id);
	}

}
