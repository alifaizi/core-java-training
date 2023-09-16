package com.scanner.practice;

import java.util.Scanner;

public class ScannerClass {

	public void login() {

		String correctUserName = "Ali";
		String correctPassword = "abc123";

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter username: ");
		String enteredUserName = scanner.nextLine();

		System.out.print("Enter password: ");
		String enteredPassword = scanner.nextLine();

		if (enteredUserName.equals(correctUserName) && enteredPassword.equals(correctPassword)) {
			System.out.println("Logged in successfully!");
		} else if (!enteredUserName.equals(correctUserName) && !enteredPassword.equals(correctPassword)) {
			System.out.println("Username and password are not correct!");
		} else if (!enteredUserName.equals(correctUserName)) {
			System.out.println("Your username is not correct!");
		} else if (!enteredPassword.equals(correctPassword)) {
			System.out.println("Your password is not correct!");
		} else {
			System.out.println("User does not exist!");
		}

		scanner.close();
	}

	public static void main(String[] args) {
		ScannerClass userCredential = new ScannerClass();
		userCredential.login();
	}
}
