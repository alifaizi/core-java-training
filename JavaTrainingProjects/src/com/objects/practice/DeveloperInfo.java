package com.objects.practice;

public class DeveloperInfo {
	
	String firstName;
	String lastName;
	int age;
	double salary;
	String postion;
	
	public DeveloperInfo(String firstName, String lastName, int age, double salary, String postion) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.postion = postion;
		
	}
	
	public String writeCode() {
		
		return "Write code for backend application";
	}
	
	public String leadsDevTeam() {
		
		return "Lead the development team throughout the development process.";
	}
	
	public static void main(String[] args) {
		
		DeveloperInfo leadDeveloper = new DeveloperInfo("Ali", "Faizi", 36, 5500.76, "Lead Developer");
		
		System.out.println("Developer 1 Details: ");
		System.out.println("First Name: " + leadDeveloper.firstName);
		System.out.println("Last Name: " + leadDeveloper.lastName);
		System.out.println("Age: " + leadDeveloper.age);
		System.out.println("Salary: " + leadDeveloper.salary);
		System.out.println("Position: " + leadDeveloper.postion);
		
		System.out.println("Main duties: ");
		System.out.println("- " + leadDeveloper.writeCode());
		System.out.println("- " + leadDeveloper.leadsDevTeam());
		
	}
	
}
