package com.switchcase.practice;

public class SwitchCaseWithCharacter {

	public static void main(String[] args) {
		
		char grade = 'B';
		String result;

		switch (grade) {
		    case 'A':
		    case 'a':
		        result = "Excellent";
		        break;
		    case 'B':
		    case 'b':
		        result = "Good";
		        break;
		    case 'C':
		    case 'c':
		        result = "Satisfactory";
		        break;
		    default:
		        result = "Needs improvement";
		}

		System.out.println("Your grade is: " + grade + " - " + result);

	}

}
