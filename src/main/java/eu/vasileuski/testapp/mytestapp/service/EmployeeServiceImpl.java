package eu.vasileuski.testapp.mytestapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.vasileuski.testapp.mytestapp.dao.IEmployeeDao;
import eu.vasileuski.testapp.mytestapp.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAll();
	}

	@Override
	public Employee getEmployeeProfile(long id) {
		return employeeDao.getEmployee(id);
	}

	@Override
	public void createEmployeeProfile(Employee employee) {
		employeeDao.createEmployee(employee);
	}

	@Override
	public void removeEmployeeProfile(long id) {
		employeeDao.deleteEmployee(id);
	}

	@Override
	public void updateEmployeeProfile(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

}
