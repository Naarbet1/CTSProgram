package com.cts.modeltest;

import java.util.List;

import com.cts.employeedetails.Employee;
import com.cts.modelimpl.EmployeeServiceImpl;
import com.cts.modelservice.EmployeeService;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		EmployeeService empservice = new EmployeeServiceImpl();

		Employee emp;

	/*	emp = new Employee(101, "Saravanan", 2000,1);
		try {
			empservice.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp = new Employee(102, "Ramesh", 4000,1);
		try {
			empservice.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp = new Employee(103, "Sanjay", 6000,1);
		try {
			empservice.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */

		// empService.display(emp);
		// before Update
		/*System.out.println("Before Updating");
		List<Employee> empList = empservice.get();
		empservice.display(empList);
        */
		// After Update
		System.out.println("After Updating");
		emp = new Employee(103, "Ponnusamy", 10000);
		empservice.update(emp);
		List<Employee> empList1 = empservice.get();
		empservice.display(empList1);

		// After Delete
		System.out.println("After Delete");
		empservice.delete(102);
		/*List<Employee> empList11 = empservice.get();
		empservice.display(empList11);
        System.out.println("Particular Employee details");
		// get Employee using id
		System.out.println(empservice.get(103));
		// get Employee List using salary min and Max
        System.out.println("Employee List Min and Max Salary");
		List<Employee> empLis = empservice.get(5000, 11000);
		empservice.display(empLis);
		 System.out.println("Employee List greater than Some Salary");
		 List<Employee> empLis1 = empservice.getemployeeGreaterAmount(7000);
		 empservice.display(empLis1);  */
	}
}
