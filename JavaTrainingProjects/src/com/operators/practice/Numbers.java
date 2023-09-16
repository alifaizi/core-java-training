package com.operators.practice;

public class Numbers {

	public int sumNumbers() {

		// Local variables

		int num1 = 40;
		int num2 = 60;

		int num3 = num1 + num2;

		return num3;
	}

	public int subtractNumbers() {

		int num4 = 100;
		int num5 = 60;

		int num6 = num4 - num5;

		return num6;
	}
	
	
	public int sumOtherNumber() {
		
		Integer obj = new Integer(0);
		
		int sumOfTwoNums = obj.sum(200, 400);
		
		return sumOfTwoNums;
	}

//	public int subtractOtherNumber() {
//		
//		Integer obj1 = new Integer(0);
//		
//		int subOfTwoNums = obj1.minus(400, 200);
//		
//		return subOfTwoNums;
//	}

	
	public int remainderOfTwoNumbers() {
		
		int num7 = 100;
		int num8 = 4;
		
		int num9 = num7 % num8;
		
		return num9;
	}
	
	
	
	public static void main(String[] args) {

		Numbers nums = new Numbers();
		
		System.out.println(nums.sumNumbers());

		System.out.println(nums.subtractNumbers());
		
		System.out.println(nums.sumOtherNumber());
		
//		System.out.println(nums.subtractOtherNumber());
		
		System.out.println(nums.remainderOfTwoNumbers());

	}
}