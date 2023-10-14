package com.loops.practice;

public class ForLoopReview {

	public static void main(String[] args) {

		/*
		 * Write program to print from 10 to 20 using for-loop Write another program to
		 * print a list of names using for-each loop
		 */
		
		System.out.println("---------------------For Loop-----------------------");

		for (int i = 10; i <= 20; i++) {

			System.out.println(i);
		}

		System.out.println("---------------------For-Each or Enhance Loop-----------------------");

		String[] names = { "Ali", "Wakil", "Ahmad", "Sara", "Daniel", "Oscar" };

		for (String name : names) {

			System.out.println(name);
		}

		System.out.println("---------------------Do While Loop-----------------------------");

		int num = 1;

		do {
			System.out.println(num);
			num++;
		} while (num <= 19);

		System.out.println("------------------------While Loop------------------------");

		int num1 = 1;

		while (num1 <= 10) {
		    System.out.println("Number: " + num1);
		    num1++;
		}
	}
}