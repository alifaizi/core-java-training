package com.operators.practice;

public class AssignmentOperators {
	
	// =
	public int assignNum() {

		int a = 20;
		
		return a;
	}
	
	// +=
	public int assignNumWithTotalBothSides() {

		int x = 40;
		int y = 60;
		
		int z = x += y;
		
		return z;
	}
	
	// -=
	public int assignNumWithMinusBothSides() {

		int a = 80;
		int b = 30;
		
		int c = a -= b;
		
		return c;
	}
	
	// *=
	public int assignNumWithMultiplyBothSides() {

		int num1 = 5;
		int num2 = 4;
		
		int num3 = num1 *= num2;
		
		return num3;
	}
	
	// /=
	public int assignNumWithDivisionBothSides() {

		int num4 = 15;
		int num5 = 3;
		
		int num6 = num4 /= num5;
		
		return num6;
	}
	
	// %=
	public int assignNumWithRemainder() {

		int num7 = 10;
		int num8 = 2;
		
		int num9 = num7 %= num8;
		
		return num9;
	}
	
	public static void main(String[] args) {
		
		AssignmentOperators obj = new AssignmentOperators();
		
		System.out.println(obj.assignNum());
		
		System.out.println(obj.assignNumWithTotalBothSides());
		
		System.out.println(obj.assignNumWithMinusBothSides());
		
		System.out.println(obj.assignNumWithMultiplyBothSides());
		
		System.out.println(obj.assignNumWithDivisionBothSides());
		
		System.out.println(obj.assignNumWithRemainder());
	}

}
