package com.loops.practice;

public class LoopWithContinueKeyword {
	
	public static void main(String[] args) {
		
	        // Using a for loop to print odd numbers from 1 to 10
	        for (int i = 1; i <= 10; i++) {
	        	
	            // Check if the number is even
	            if (i % 2 == 0) {
	            	
	                // Skip even numbers and continue to the next iteration
	                continue;
	            }
	            System.out.println("Odd Number: " + i);
	        }
	        
	        
	            // Using a for loop to skip two numbers in the range from 1 to 10
	            for (int i = 1; i <= 10; i++) {
	            	
	                // Check if the current number is one of the numbers to skip
	                if (i == 3 || i == 6) {
	                	
	                    // Skip the current number and continue to the next iteration
	                    continue;
	                }
	                System.out.println("Number: " + i);
	            }
	        }
	    }


