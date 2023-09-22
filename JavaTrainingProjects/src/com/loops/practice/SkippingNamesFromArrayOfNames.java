package com.loops.practice;

public class SkippingNamesFromArrayOfNames {

	public static void main(String[] args) {

		// array
		String names[] = { "Ahmad", "Sahar", "Omid", "Tamana", "Zuhal", "Jamal" };
		// for each loop or enhanced loop
		/*
		 * System.out.println(names[5]); // System.out.println("============\n");
		 * for(String n : names) { System.out.println(n); }
		 */

		for (int r = 2; r < names.length; r++) {
			System.out.println(names[r]);
		}

	}

}