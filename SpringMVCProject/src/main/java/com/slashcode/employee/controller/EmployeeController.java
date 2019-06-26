package com.slashcode.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.slashcode.employee.model.Employee;
import com.slashcode.employee.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	IEmployeeService serviceRef;
	
	@RequestMapping("/")
	public String getHomePage(Model model) {
		model.addAttribute("successMsg", "Welcome to My Youtube Channel /Code");
		
		return "Homepage";
	}
	
	@RequestMapping("/addNewEmployee")
	public String addNewEmployeePage(Model model) {
		model.addAttribute("employee",new Employee());
		return "NewEmployee";
	}
	
	
	@RequestMapping("/addEmployeeDetails")
	public String addEmployeeDetails(@ModelAttribute("employee") Employee employee, BindingResult result, Model model){
		
		if(result.hasErrors()){
			return "NewEmployee";
		}
		else{
			serviceRef.addEmployee(employee);
			model.addAttribute("successMsg", "Data Inserted Successfully");
			return "Homepage";
			/*
			model.addAttribute("student", student);
			
			return "show";*/
		}
	}
	
	@RequestMapping("/getAllEmployee")
	public String getEmployeeList(Model model) {
		List<Employee> empList = new ArrayList<Employee>();
		empList= serviceRef.getAllEmployee();
		model.addAttribute("employeeList",empList);
		return "employeeview";
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public String Employee(Model model, @RequestParam("empId") int empId) {
		Employee emp  = serviceRef.getEmployeeById(empId);
		System.out.println("Before view "+emp);
		model.addAttribute("employeeData",emp);
		return "EmployeeOperation";
	}
	
	@RequestMapping("/updateEmployee")
	public String updateEmployee(Model model, @RequestParam("empId") int empId) {
		Employee emp = serviceRef.getEmployeeById(empId);
		System.out.println("in update Emp"+emp);
		model.addAttribute("employeeDetails", emp);
		return "updateEmployeePage";
	}
	
	@RequestMapping("/updateEmployeeDetails")
	public String updateEmployeeDetail(@ModelAttribute("employee") Employee employee, BindingResult result, Model model){
		
		if(result.hasErrors()){
			return "NewEmployee";
		}
		else{
			System.out.println(employee);
			serviceRef.updateEmployee(employee, employee.getEmpId());
			model.addAttribute("successMsg", "Employee Updated Successfully");
			
			return "Homepage";
			/*
			model.addAttribute("student", student);
			
			return "show";*/
		}
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(Model model, @RequestParam("empId") int empId) {
		System.out.println("in delete Emp"+empId);
		serviceRef.deleteEmployee(empId);
		model.addAttribute("successMsg", "Employee Deleted Successfully");
		
		return "Homepage";
	}
	
}
