package com.slashcode.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private String deptName;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + "]";
	}
	
	
}
