package com.cts.modelimpl;

import java.util.ArrayList;
import java.util.List;

import com.cts.employeedetails.Employee;
import com.cts.modelservice.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	private List<Employee> empList;

	public EmployeeServiceImpl() {
		empList = new ArrayList<Employee>();
	}
	public List<Employee> get() {
		return empList;
	}
	
	public void display(Employee emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
	public void display(List<Employee> empList) {
		for (Employee emp : empList) {
			display(emp);
		}
	}
	public List<Employee> get(int min, int max) {
		// List<Employee> emp=get();
		List<Employee> salaryList = new ArrayList();
		for (Employee employee : empList) {
			if ((employee.getSalary() > min) && (employee.getSalary() < max))
				salaryList.add(employee);
		}
		return salaryList;
	}
	public List<Employee> getemployeeGreaterAmount(int amount) {
		List<Employee> salaryList = new ArrayList();
		for (Employee employee : empList) {
			if ((employee.getSalary() >= amount))
				salaryList.add(employee);
		}
		return salaryList;
	}
	@Override
	public boolean save(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean update(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}