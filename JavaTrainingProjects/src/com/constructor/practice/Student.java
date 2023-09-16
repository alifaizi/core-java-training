package com.constructor.practice;

public class Student {
	
	/* Default constructor:
	 * JVM create the default constructor behind the scene, if we do not create one
	 */
	
	/* No argument constructor
	 * Constructor that does not have parameter
	 * example: 
	 * public Student(){}
	 */
	
	/* Parameterized Constructor
	 * Constructor that holds parameters
	 * example:
	 * public Student(String name, int id){}
	 */
	
	public String firstName; // From this line, it goes to print
	public String lastName;
	public int age;
	public char gender;
	
	public Student(String firstName, String lastName, int age, char gender) { // From this line, it goes to right side of line 28
		
		this.firstName = firstName; // From this line, it goes to left side of line 28
		this.lastName = lastName; // From left side of line this line, it goes to line 21
		this.age = age;
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		
		Student student = new Student("Ali", "Faizi", 36, 'M'); // From  this line, it goes to line 26
		
		System.out.println("First Name: " + student.firstName);
		System.out.println("Last Name: " + student.lastName);
		System.out.println("Age: " + student.age);
		System.out.println("Gender: " + student.gender);
	}

}
