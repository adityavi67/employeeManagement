package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {
	
	public static void main(String[] args) {
		EmployeeMain app = new EmployeeMain();
		app.start();
	}
	public void start() {
		Employee employees[] = new Employee[4];
		Department department1 = new Department("001", "Development");
		Department department2 = new Department("002", "Testing");
		Developer developer1 = new Developer(01, "Aditya", department1, "Python");
		Developer developer2 = new Developer(02, "Vishal", department1, "Java");
		Tester tester1 = new Tester(03, "Akundi", department2, "hp");
		Tester tester2 = new Tester(04, "Kumar", department2, "Lenovo");

		
		employees[0] = developer1;
		employees[1] = developer2;
		employees[2] = tester1;
		employees[3] = tester2;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] instanceof Developer) {
				Developer developer = (Developer) employees[i];
				displayCustomer(developer);
			}
			else {
				Tester tester = (Tester) employees[i];
				displayEmployee(tester);
			}
		}

	}

	void displayBaseEmployee(Employee employee) {
		System.out.println("Employee id is " + employee.getId());
		System.out.println("Employee name is " + employee.getName());
		Department department = employee.getDepartment();
		System.out.println("Employee department id is " + department.getDeptId());
		System.out.println("Employee department name is " + department.getDeptName());
	}

	void displayCustomer(Developer employee) {
		displayBaseEmployee(employee);
		System.out.println("Language used by developer is " + employee.getLanguage());
	}

	void displayEmployee(Tester employee) {
		displayBaseEmployee(employee);
		System.out.println("Tools used by tester is " + employee.getTools());
	}
}
