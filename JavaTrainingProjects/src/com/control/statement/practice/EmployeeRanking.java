package com.control.statement.practice;

public class EmployeeRanking {

	/*
	 * Write a program in Java to show the ranking level of the employees: Create a
	 * method and inside the method use control statements to achieve your program
	 * outcome. If the promotionCode is 5 assign ranking level as one If the
	 * promotionCode is 5 assign ranking level as two If the promotionCode is 5
	 * assign ranking level as three Otherwise assign ranking level 4 Inside the
	 * main method, create the object of the class and call the method using the
	 * object. Then print it in the console.
	 */

	int promotionCode = 4;
	String level;

	// Method to determine ranking level

	public String determineRankingLevel() {
		
		if (promotionCode >= 5) {
			level = "One";
			
		} else if (promotionCode == 4) {
			level = "Two";
			
		} else if (promotionCode == 3) {
			level = "Three";
			
		} else {
			level = "Four";
		}

		return level;
	}

	public static void main(String[] args) {

		// Create an object of level
		EmployeeRanking employee = new EmployeeRanking();

		// Call the method to determine ranking level
		System.out.println("Your level is: " + employee.determineRankingLevel());

	}
}