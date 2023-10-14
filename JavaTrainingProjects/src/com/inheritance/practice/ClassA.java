package com.inheritance.practice;

public class ClassA {
	
	static String name;
	static String address;
	
	public ClassA (String name, String address) {
		
		this.name = name;
		this.address = address;
		
	}
	
	public static String showDetails () {
		
		return "Show Details";
	}

}
