package eu.vasileuski.testapp.mytestapp.service;

import java.util.List;

import eu.vasileuski.testapp.mytestapp.entity.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeProfile(long id);

	void createEmployeeProfile(Employee employee);

	void removeEmployeeProfile(long id);

	void updateEmployeeProfile(Employee employee);
}
