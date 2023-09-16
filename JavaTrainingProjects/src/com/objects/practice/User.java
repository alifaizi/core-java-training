package com.objects.practice;

public class User {
	

	/*
	 * Write a program to show the user object.
	 * Create a user Class with userName and userPassword fields
	 * and signIn() and LogOut() Methods
	 * Assign value to variables through contractor
	 * Create object inside main method and call the variables and methods to print in the console
	 */
	
	
	public static void main(String[] args) {
		
		User user1 = new User("Ali", "abc123"); 
		
		System.out.println("User Name: " + user1.userName);
		System.out.println("Password: " + user1.password);
		
		System.out.println(user1.signIn());
		System.out.println(user1.signOut());
		
	}
	
	//************************************************************************************//
	
	
	public String userName; 

	public String password;
	
	public String signIn() {
		
		return "Signed in successfully";
	}
	
	public String signOut() {
		
		return "Signout successfully";
	}
	
	public User(String userName, String password) { 
		
		this.userName = userName; 
		this.password = password;
	}
	
}