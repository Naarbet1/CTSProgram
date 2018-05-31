package com.cts.modelservice;

import java.util.*;

import com.cts.employeedetails.Employee;

public interface EmployeeService {

	// create
	public boolean save(Employee emp);
	// update
	public boolean update(Employee emp);
	// delete
	public boolean delete(int id);
	// get
	public Employee get(int id);
	// get all
	public List<Employee> get();

	public void display(Employee emp);

	public void display(List<Employee> empList);
	//get all employees whose salary between min and max
    public List<Employee> get (int min,int max);
  //get all employees whose salary greater than Some Amount
    public List<Employee> getemployeeGreaterAmount (int amount);
   
}