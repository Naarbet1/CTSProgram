package com.cts.modeltest;

import java.util.List;
import com.cts.employeedetails.Department;
import com.cts.employeedetails.Employee;
import com.cts.modelimpl.DepartmentServiceImpl;
import com.cts.modelimpl.EmployeeServiceImpl;
import com.cts.modelservice.DepartmentService;
import com.cts.modelservice.EmployeeService;

	public class DepartmentServiceTest {
		private static DepartmentService deptservice;
		private static EmployeeService empservice;

		public static void init() {
			empservice = new EmployeeServiceImpl();
			deptservice = new DepartmentServiceImpl(empservice);
			Employee emp;
			emp = new Employee(1, "Nam", 20000);
	emp = new Employee(2, "Name", 4000);
	emp = new Employee(3, "Namayva", 6000);
System.out.println("Employes Added");

			Department dept;
			dept = new Department(1, "Maintanence");
			deptservice.add(dept);
			dept = new Department(2, "Production");
			deptservice.add(dept);
			System.out.println("Department Added");
		}

		public static void main(String[] args) {

			init();

			System.out.println("Display Particular Department");
			// Display Particular Department
			System.out.println(deptservice.get(1));
			System.out.println("Display All department");
			// Display All Department
			List<Department> deptList = deptservice.get();
			deptservice.display(deptList);

			// Add Employee to Dept
			System.out.println(deptservice.addEmployetoDepartment(101, 2));
			// Display Emp in Particular Dept
			System.out.println("Employee in Particular Department");
			System.out.println(deptservice.getEmployesinParticularDepartment(1));
			// deptservice.display();

			// Another Method To display All Department
			System.out.println(deptservice.get());
			// Add Employee to Dept
			System.out.println(deptservice.addEmployetoDepartment(102, 2));
			// Another Method To display All Department
			System.out.println(deptservice.get());
			// Remove That Employee in the Particular Department
			deptservice.remove(102, 2);
			// Another Method To display All Department
			System.out.println(deptservice.get());
			System.out.println("Display Employee List in Particuar Department Who will get greater than some Amount");
			
			 List<Employee> empLis1 = deptservice.getEmployees(2, 2000);
			 if(empLis1!=null)
			 empservice.display(empLis1);
			 else
				 System.out.println("No Records Found");
			 System.out.println("Display Employee List in Particuar Department Who will get max and min for some Amount");
			 List<Employee> empList1 = deptservice.getEmployees(3000, 6000);
			 if(empList1!=null)
			 empservice.display(empList1);
			 else
				 System.out.println("No Records Found");
			
			 
		}
	}
