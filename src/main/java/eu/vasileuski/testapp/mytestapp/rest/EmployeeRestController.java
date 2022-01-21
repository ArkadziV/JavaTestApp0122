package eu.vasileuski.testapp.mytestapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.vasileuski.testapp.mytestapp.entity.Employee;
import eu.vasileuski.testapp.mytestapp.service.IEmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeRestController {

	@Autowired
	private IEmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployeeProfile(@PathVariable long employeeId) {
		Employee employee = employeeService.getEmployeeProfile(employeeId);
		return employee;
	}

	@PostMapping("/employees")
	public Employee createEmployeeProfile(@RequestBody Employee employee) {
		employee.setEmployeeId(0);
		employeeService.createEmployeeProfile(employee);
		return employee;
	}

	@PutMapping("/employees")
	public Employee updateEmployeeProfile(@RequestBody Employee employee) {
		employeeService.updateEmployeeProfile(employee);
		return employee;
	}

	@DeleteMapping("/employees/{employeeId}")
	public String removeEmployeeProfile(@PathVariable long employeeId) {
		Employee temp = employeeService.getEmployeeProfile(employeeId);
		employeeService.removeEmployeeProfile(employeeId);
		return "Profile removed: id# " + temp.getEmployeeId();
	}
}
