package com.iris.Daos;

import java.util.List;

import com.iris.Entities.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee e);
	public Employee getEmployee(String emailid);
	public List<Employee> getAllEmployee();

}
