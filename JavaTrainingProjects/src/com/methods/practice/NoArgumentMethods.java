package com.methods.practice;

public class NoArgumentMethods {
	
	public int sumTwoNumber() {
	
		int a = 20;
		int b = 30;
		
		return a + b;
		
	}
	
	public static void main(String[] args) {
		NoArgumentMethods sum = new NoArgumentMethods();
		System.out.println(sum.sumTwoNumber());
		
	}

}
