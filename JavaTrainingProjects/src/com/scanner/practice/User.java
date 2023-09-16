package com.scanner.practice;

import java.util.Scanner;

public class User {

	/*
	 * Write a program in Java to show the object of User Login using Scanner class with following requirement: 
	 * Create a class name it User and Create two fields as userName and password.
	 * Assign value to the fields using the Scanner class. Create a method and named
	 * it login. Inside the method write your login condition using if, else if, and
	 * else. Create object of your class in the main method and call the login
	 * method assign value from console to your fields.
	 */

	// Login method
	public void login() {

		// Fields
		String userName = "alifaizi";
		String password = "abc@123";

		// Scanner Class
		Scanner scanner = new Scanner(System.in);

		// User Input
		System.out.print("Enter username: ");
		String inputUserName = scanner.nextLine();

		System.out.print("Enter password: ");
		String inputPassword = scanner.nextLine();

		// Conditions
		if (inputUserName.equals(userName) && inputPassword.equals(password)) {
			System.out.println("Logged in successfully!");
			
		} else if (!inputUserName.equals(userName) && !inputPassword.equals(password)) {
			System.out.println("Username and password are not correct!");
			
		} else if (!inputUserName.equals(userName)) {
			System.out.println("Your username is not correct!");
			
		} else if (!inputPassword.equals(password)) {
			System.out.println("Your password is not correct!");
			
		} else {
			System.out.println("User does not exist!");
		}

		// Close Scanner
		scanner.close();
	}

	public static void main(String[] args) {

		// Class Object
		User user = new User();

		// Login method invoked
		user.login();
	}
}