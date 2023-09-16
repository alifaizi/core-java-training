package com.objects.practice;

public class Employee {

	
	public String name; 

	public int id;
	
	public String callCustomer() {
		
		return "Calls customers everyday";
	}
	
	public Employee(String name, int id) { 
		
		this.name = name; 
		this.id = id;

	}
	
	public static void main(String[] args) {
		
		Employee student = new Employee("Ali", 36); 
		
		System.out.println("Name: " + student.name);
		System.out.println("ID: " + student.id);
		
		System.out.println(student.callCustomer());

	}

}
