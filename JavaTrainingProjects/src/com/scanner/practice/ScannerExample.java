package com.scanner.practice;

import java.util.Scanner;

public class ScannerExample {

	String fName;
	String lName;
	int age;

	public void showDetails() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		fName = scanner.nextLine();
		System.out.print("Enter your last name: ");
		lName = scanner.nextLine();
		System.out.print("Enter your age: ");
		age = scanner.nextInt();

		System.out.println("============================ *** ============================");

	}

	public static void main(String[] args) {

		ScannerExample obj = new ScannerExample();

		obj.showDetails();
		System.out.println("Your first name is: " + obj.fName);
		System.out.println("Your last name is: " + obj.lName);
		System.out.println("Your age is: " + obj.age);

	}
}
