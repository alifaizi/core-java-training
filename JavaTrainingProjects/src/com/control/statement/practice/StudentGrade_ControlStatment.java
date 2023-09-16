package com.control.statement.practice;

public class StudentGrade_ControlStatment {
	
	String studentName = "Ahmad";
	int testScore = 77;
	String grade;
	
	public String studentGrade() {
		
		if (studentName.equals(studentName) && testScore >= 90) {
			grade = "A+";
			
		}else if (studentName.equals(studentName) && testScore >= 80) {
			grade = "A";
			
		}else if (studentName.equals(studentName) && testScore >= 70) {
			grade = "B";
			
		}else if (studentName.equals(studentName) && testScore >= 60) {
			grade = "C";
			
		}else if (studentName.equals(studentName) && testScore >= 50) {
			grade = "D";
			
		}else{
			
			grade = "F";
		}
		
		return studentName + "'s grade: " + grade;
	}
	
	public static void main(String[] args) {
		
		StudentGrade_ControlStatment student1 = new StudentGrade_ControlStatment();
		
		System.out.println(student1.studentGrade());
	}

}
