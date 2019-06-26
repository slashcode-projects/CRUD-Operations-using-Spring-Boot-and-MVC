package com.slashcode.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slashcode.employee.model.Employee;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer> {

	List<Employee> findByDeptName(String deptName);
}
