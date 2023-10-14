package com.collections;

import java.util.ArrayList;

public class EmployeeDetailsWithGetterAndSetter {

	public static void main(String[] args) {

		EmployeeWithGetterAndSetter emp1 = new EmployeeWithGetterAndSetter("Ali", "Faizi", 36, "123 main st, Springfield, VA, 112234-1234");
		EmployeeWithGetterAndSetter emp2 = new EmployeeWithGetterAndSetter("Sara", "Amadori", 32, "123 main st, Arlington, VA, 9876543-5432");
		EmployeeWithGetterAndSetter emp3 = new EmployeeWithGetterAndSetter("John", "Stevenson", 40, "123 main ave, Alexandria, VA, 553454-5467");
		EmployeeWithGetterAndSetter emp4 = new EmployeeWithGetterAndSetter("Robin", "Johnson", 28, "432 main dr, Tysons Cornor, VA, 765436-8765");

		ArrayList<EmployeeWithGetterAndSetter> employeeList = new ArrayList<EmployeeWithGetterAndSetter>();

		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);

			for (EmployeeWithGetterAndSetter employee : employeeList) {

				System.out.println(employee.getFirstName() + " " +  employee.getLastName() + " " + employee.getAge() + " " + employee.getAddress());
			}
			System.out.println();
		}
	}
