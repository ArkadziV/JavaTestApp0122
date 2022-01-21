package eu.vasileuski.testapp.mytestapp.entity;

import java.time.LocalDate;

public class Employee {
	
	private long employeeId;

	private String firstName;

	private String lastName;

	private long departmentId;

	private String jobTitle;

	private String gender;

	private LocalDate dateOfBirth;

	public Employee() {
	}

	public Employee(String firstName, String lastName, long departmentId, String jobTitle,
			String gender, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentId = departmentId;
		this.jobTitle = jobTitle;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public Employee(long employeeId, String firstName, String lastName, long departmentId, String jobTitle,
			String gender, LocalDate dateOfBirth) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentId = departmentId;
		this.jobTitle = jobTitle;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", departmentId=" + departmentId + ", jobTitle=" + jobTitle + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
}
