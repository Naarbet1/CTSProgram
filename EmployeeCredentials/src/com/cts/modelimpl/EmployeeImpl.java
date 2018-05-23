package com.cts.modelimpl;

import java.util.ArrayList;
import java.util.List;
import com.cts.model.Employee;

public class EmployeeImpl implements EmployeeService {

	private List<Employee> empList;

	public EmployeeImpl() {
		empList = new ArrayList<Employee>();
	}

	public boolean save(Employee emp) {

		if (get(emp.getId()) != null) {
			return false;
		}

		empList.add(emp);

		return true;
	}

	public boolean update(Employee emp) {

		if (get(emp.getId()) == null) {
			return false;
		}

		empList.add(emp);

		return true;
	}

	public boolean delete(int id) {
		Employee emp = get(id);
		if (emp == null) {
			return false;
		}

		empList.remove(emp);

		return true;
	}

	@Override
	public Employee get(int id) {

		for (Employee emp : empList) {
			if (emp.getId() == id)
				return emp;

		}
		return null;

	}

	public List<Employee> get() {
		// TODO Auto-generated method stub
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

}
