package com.cts.modelimpl;

import java.util.List;
import com.cts.model.Employee;
import com.cts.model.EmployeeDetails;

public class EmployeeImpel implements Employee {

	private List<EmployeeDetails> empList;

	List<Employee> emplist;

	public boolean save(EmployeeDetails emp) {

		if (get(emp.getId()) != null) {
			return false;
		}
		empList.add(emp);

		return true;
	}

	public boolean update(EmployeeDetails emp) {
		if (get(emp.getId()) == null) {
			return false;
		}

		empList.add(emp);

		return true;
	}

	public boolean delete(int Id) {
		return false;
	}

	public Employee get(int Id) {
		return null;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(Employee emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
	}

	@Override
	public void display(List<Employee> empList) {
		for(Employee emp: empList)
		{
			display(emp);
		}
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

	public int getsalery() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}