package com.constructor.practice;

public class Engineer {
	
	public String fullName;
	public int age;
	public char gender;
	public String profession;
	
	
	public String desigBrides() {
		
		return fullName + " designs the blue print of bridges.";
		
	}

	public Engineer(String fullName, int age, char gender, String profession) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.profession = profession;
	}
	
	public static void main(String[] args) {
		
		Engineer civilEngineer = new Engineer ("Mike Jones", 42, 'M', "Civil Engineering" );
		
		System.out.println("Full Name: " + civilEngineer.fullName);
		System.out.println("Job: " + civilEngineer.age);
		System.out.println("Gender: " + civilEngineer.gender);
		System.out.println("Profession: " + civilEngineer.profession);
		
		String job = civilEngineer.desigBrides();
		System.out.println(job);
	}

}
