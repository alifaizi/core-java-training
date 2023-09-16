package com.control.statement.practice;

public class StudentsGrade {
	
	
	/* Objective: Write a program to determine the grades of students based on their scores. Utilize control statements to complete your code.
	 * If the score is 90 or greater, assign the grade ‘A’.
	 * If the score is 80 or greater, assign the grade ‘B’.
	 * If the score is 70 or greater, assign the grade ‘C’.
	 * If the score is 60 or greater, assign the grade ‘D’.
	 * Otherwise, assign the grade ‘F’.
	 */
	
	String studentName = "Joe";
	int marks = 49;
	String grade; 
	
	public String getStudentGrade() {
		
		if (marks >= 90) {
			grade = "A+" + " - Excellent";
		}else if (marks >= 80) {
			
			grade = "A"  + " - Great";
		}else if (marks >= 70) {
			
			grade = "B"  + " - very Good";
		}else if (marks >= 60) {
			
			grade = "C"  + " - Good";

		}else if (marks >= 50) {
			
			grade = "D"  + " - Work Harder";
			
		}else {
			
			grade = "F"  + " Sorry, you are failed!";
		}			
		
		return studentName + "'s grade is: " + grade;
	}
	
	public static void main(String[] args) {
		
		StudentsGrade student = new StudentsGrade();
		
		String studentGrade = student.getStudentGrade();
		
		System.out.println(studentGrade);
	}

}
