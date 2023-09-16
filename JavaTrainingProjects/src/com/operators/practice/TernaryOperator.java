package com.operators.practice;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		// Ternary Operators
		
		// ? = True
		// : = False
		
		// In this example, we have two numbers a and b. We use nested ternary operators to check the relationship between the two numbers:
		
		int a = 15;
		int b = 30;
		
		// The first ternary operator (a > b) ? "Greater" : ... checks if a is greater than b. If it is, it assigns the string "Greater" to the result variable.
		// The second ternary operator (a < b) ? "Smaller" : ... checks if a is smaller than b. If it is, it assigns the string "Smaller" to the result variable.
		// If neither condition is true (i.e., a is equal to b), it assigns the string "Equal" to the result variable.	
		
		String result = (a > b) ? "Greater" : (a < b) ? "Smaller" : "Equal";
		
		//Finally, we print the result, which indicates whether num1 is greater, smaller, or equal to num2.
		
		System.out.println(result);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		
		int x;
		int z;
		
		x = 50;
		
		z = (x == 50) ? 500 : 400;
		
		System.out.println(z);
	}
}
