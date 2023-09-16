package com.operators.practice;

public class ComparisonOperators {
	
	/*
	 * equal ==
	 * Not equal !=
	 * Greater than >
	 * Less than <
	 * Greater than or equal >=
	 * Less than or equal <=
	 */
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		
		boolean num3 = num1 != num2;
		System.out.println(num3);
		
		System.out.println("-----------------------------------------");
		
		boolean num4 = num1 >= num2;
		System.out.println(num4);
		
		System.out.println("-----------------------------------------");
		
		boolean num5 = num1 > num2;
		System.out.println(num5);
		
		System.out.println("-----------------------------------------");
		
		boolean num6 = num1 <= num2;
		System.out.println(num6);
		
		System.out.println("-----------------------------------------");
		
		boolean num7 = num1 > num2;
		System.out.println(num7);
	}
}
