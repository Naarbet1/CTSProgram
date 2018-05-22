package com.cts.model;

import java.util.List;
public interface Employee {

	public int getsalery=(Integer) null;

	public boolean save(Employee emp);

	public boolean update(Employee emp);

	public boolean delete(int Id);

	public Employee get(int Id);

	public List<Employee> get();

	public void display(Employee emp);

	public void display(List<Employee> empList);

	public int getId();

	public String getName();

}
