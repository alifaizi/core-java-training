package com.switchcase.practice;

import java.util.Scanner;

public class StudentGradesWithSwitch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Student 1
        System.out.println("Enter scores for Student 1 - Exam 1:");
        int writing1 = scanner.nextInt();
        int reading1 = scanner.nextInt();
        int speaking1 = scanner.nextInt();
        int grammar1 = scanner.nextInt();

        System.out.println("Enter scores for Student 1 - Exam 2:");
        int math1 = scanner.nextInt();
        int physics1 = scanner.nextInt();
        int chemistry1 = scanner.nextInt();
        int biology1 = scanner.nextInt();

        // Calculate average scores for Student 1
        double average1 = (writing1 + reading1 + speaking1 + grammar1 + math1 + physics1 + chemistry1 + biology1) / 8.0;

        // Determine grade for Student 1
        char grade1 = calculateGrade(average1);

        // Repeat the process for Student 2 and Student 3...

        // Print results
        System.out.println("Student 1 Grade: " + grade1);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate grade based on average score
    private static char calculateGrade(double average) {
        int averageScore = (int) average; // Convert to integer for switch statement
        char grade;

        switch (averageScore / 10) {
            case 9:
            case 10:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }

        return grade;
    }
}