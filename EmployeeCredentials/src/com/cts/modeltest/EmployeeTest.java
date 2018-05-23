package com.cts.modeltest;
import java.util.List;
import com.cts.model.Employee;
import com.cts.modelimpl.EmployeeImpl;
import com.cts.modelimpl.EmployeeService;

public class EmployeeTest{

	public static void main(String[] args) {
		EmployeeService empService = new EmployeeImpl();

		Employee emp;

		emp = new Employee(01, "Naarbet", 10000);

		empService.save(emp);

		emp = new Employee(02, "Xavier", 45000);

		empService.save(emp);

		List<Employee> empList = empService.get();

		empService.display(empList);

	}

}