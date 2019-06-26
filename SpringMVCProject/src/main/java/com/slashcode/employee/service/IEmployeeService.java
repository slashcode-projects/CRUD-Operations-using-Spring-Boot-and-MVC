package com.slashcode.employee.service;

import java.util.List;

import com.slashcode.employee.model.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployee();
	Employee getEmployeeById(int empId);
	void addEmployee(Employee employee);
	void updateEmployee(Employee employee, int empId);
	void deleteEmployee(int empId);
	List<Employee> getEmployeeByDept(String deptName);

}
