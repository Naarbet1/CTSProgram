package com.cts.test;

import com.cts.oopsassignment.Address;
import com.cts.oopsassignment.ContractEmployee;
import com.cts.oopsassignment.EmployeeDetails;

public class EmployeeDetailsTest {

	public static void main(String[] args) {
		
		EmployeeDetails emp = new EmployeeDetails(200, "Vishal", "Programmer");
		/*
		 * emp.setid(201); emp.setName("Naarbet"); emp.setDesigination(
		 * "Programmer Trainee");
		 */

		emp.setSalery(10000);
		System.out.println(emp.getid());
		System.out.println(emp.getName());
		System.out.println(emp.getDesigination());

		System.out.println(emp.getSalery());

		EmployeeDetails emp1 = new EmployeeDetails(201, "Vishal", "Programmer");

		emp1.setSalery(10000);
		System.out.println(emp1.getid());
		System.out.println(emp1.getName());
		System.out.println(emp1.getDesigination());
		System.out.println(emp1.getSalery());
		System.out.println(emp.equals(emp1));
		System.out.println(emp.hashCode() == emp1.hashCode());
		System.out.println(emp + System.lineSeparator() + emp1);
		
		Address address=new Address("Nan Street","chennai",602582);
		ContractEmployee emp3 = new ContractEmployee(202, "Vishal", "Programmer");
		emp3.setMonths(-500);
		System.out.println(emp3.getMonths());
		System.out.println(address.getStreet());
		System.out.println(address.getCity());
		System.out.println(address.getPincode());
	}

}