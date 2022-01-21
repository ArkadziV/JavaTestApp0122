package eu.vasileuski.testapp.mytestapp.dao;

import java.util.List;

import eu.vasileuski.testapp.mytestapp.entity.Employee;

public interface IEmployeeDao {

	List<Employee> getAll();

	Employee getEmployee(long id);

	int createEmployee(Employee employee);

	int updateEmployee(Employee employee);

	int deleteEmployee(long id);

}
