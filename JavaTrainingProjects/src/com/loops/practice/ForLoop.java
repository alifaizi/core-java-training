package com.loops.practice;

public class ForLoop {
	
	public static void main(String[] args) {
		
		
		// initialization + condition + increment/decrement
		// for (int i=0; i>=5; i++){Statement}
		
		
		// Increment
		
		for (int i = 1; i <= 10; i++) {
			
		    System.out.println("Iteration " + i);
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		for (int i = -10; i <= 0; i++) {
			
		    System.out.println("Iteration " + i);
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		
		// Decrement
		
		for (int i = 10; i >= 1; i--) {
			
		    System.out.println("Iteration " + i);
		}

	}

}
