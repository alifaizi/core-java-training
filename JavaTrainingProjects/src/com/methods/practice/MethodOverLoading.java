package com.methods.practice;

public class MethodOverLoading {
		
	public static int sumNumbers(int a, int b) {
		
		int c = a + b;
		
		return c;
	}
	
	public static int sumNumbers(int a, int b, int c) {
		
		int d = a + b - c;
		
		return d;
	}
	
	public static double sumNumbers(int a, int b, int c, double d) {
		
		double e = (a * b) - c + d;
		
		return e;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sumNumbers(3, 5));
		
		System.out.println(sumNumbers(5, 7, 3));
		
		System.out.println(sumNumbers(3, 5, 3, 2.2));
		
	}

}
