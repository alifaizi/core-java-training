package com.collections;

import java.util.ArrayList;

public class EmployeeDetails {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Ali", "Faizi", 36, "123 main st, Springfield, VA, 112234-1234");
		Employee emp2 = new Employee("Sara", "Amadori", 32, "123 main st, Arlington, VA, 9876543-5432");
		Employee emp3 = new Employee("John", "Stevenson", 40, "123 main ave, Alexandria, VA, 553454-5467");
		Employee emp4 = new Employee("Robin", "Johnson", 28, "432 main dr, Tysons Cornor, VA, 765436-8765");

		ArrayList<Employee> empList = new ArrayList<Employee>();

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

			for (Employee emp : empList) {

				System.out.println(emp.firstName + " " +  emp.lastName + " " + emp.age + " " + emp.address);
			}
			System.out.println();
		}
	}
