package com.switchcase.practice;

import java.util.Scanner;

public class StudentGradesWithScanner {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Student 1 -- Ali Faizi
        System.out.println("Enter Ali Faizi's scores for exam 1:");
        
        int writing = getSubjectScore(scanner, "Writing");
        int reading = getSubjectScore(scanner, "Reading");
        int computer = getSubjectScore(scanner, "Computer");
        int socialStudies = getSubjectScore(scanner, "Social Studies");
        
        System.out.println();

        System.out.println("Enter Ali Faizi's scores for exam 2:");
        
        int math = getSubjectScore(scanner, "Math");
        int physics = getSubjectScore(scanner, "Physics");
        int chemistry = getSubjectScore(scanner, "Chemistry");
        int biology = getSubjectScore(scanner, "Biology");

        // Calculate average scores for Student 1
        double average = (writing + reading + computer + socialStudies + math + physics + chemistry + biology) / 8.0;

        // Determine grade for Student 1
        char grade = calculateGrade(average);

        // Print results
        
        System.out.println("Student 1 Average Grade: " + grade);

        // Repeat the process for Student 2 and Student 3...

        // Close the scanner
        scanner.close();
    }

    // Function to get subject score from user input
    
    private static int getSubjectScore(Scanner scanner, String subject) {
    	System.out.println();
        System.out.print("Score for " + subject + ": ");
        return scanner.nextInt();
    }

    // Function to calculate grade based on average score
    private static char calculateGrade(double average) {
        switch ((int) (average / 10)) {
            case 9:
            case 10:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'F';
        }
    }
}