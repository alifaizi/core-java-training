package com.java.project1.package1;

public class ClassA {
	
	// Variables are Containers that hold data temporarily 
	
	/*
	 * Types of Variables:
	 * 1 - Global/Instance Variable - Inside class but outside method. We need object to access
	 * 2 - Static Variables - Used with static keyword inside the class. We do not need to Object to access the value
	 * 3 - Local Variables - Inside Methods. We need object to access 
	 */
	
	// Global Variable
	public String name = "Sahar";
	public int age = 20;
	
	// Static Variable
	public static String lastName = "Faizi";
	
	// Local Variable
	public int sumTwoNumbers() {
		int a = 20;
		int b = 30;
		return a + b;
	}
	
	// Here the Access Modifier is public - means it can be accessed from anywhere
	
	public static void main(String[] args) {
		
		// Object created
		ClassA obj = new ClassA();
		
		// Accessing Global Variable
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		// Accessing static variable
		System.out.println(lastName);
		
		// Accessing local variable
		System.out.println(obj.sumTwoNumbers());
	}
}
