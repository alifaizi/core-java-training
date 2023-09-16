package com.control.statement.practice;

import java.util.Scanner;

public class StudentGradeWithScanner {

	public static void main(String[] args) {
		
		// Creating Scanner object
		Scanner scanner = new Scanner(System.in);

		// Entering student name and role number
		System.out.print("Enter student name: ");
		String studentName = scanner.nextLine();
		
		System.out.print("Enter student role number: ");
		String studentRoleNumber = scanner.nextLine();

		// Entering test score
		System.out.print("Enter test score: ");
		int testScore = scanner.nextInt();

		// Initialize studentGrade
		char studentGrade;

		// Grade based on the test score
		if (testScore >= 90) {
			studentGrade = 'A';
		} else if (testScore >= 80) {
			studentGrade = 'B';
		} else if (testScore >= 70) {
			studentGrade = 'C';
		} else if (testScore >= 60) {
			studentGrade = 'D';
		} else {
			studentGrade = 'F';
		}

		System.out.println("----------------------***-----------------------------");
		
		// Printing the student's information and grade in the console
		
		System.out.println("\nStudent Name: " + studentName);
		System.out.println("Student Role Number: " + studentRoleNumber);
		System.out.println("Test Score: " + testScore);
		System.out.println("Student Grade: " + studentGrade);

		// Close the scanner
		scanner.close();
	}
}