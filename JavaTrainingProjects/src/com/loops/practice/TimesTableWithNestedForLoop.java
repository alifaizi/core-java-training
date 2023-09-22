package com.loops.practice;

public class TimesTableWithNestedForLoop {
	
    public static void main(String[] args) {
        int tableSize = 10; // Change this to adjust the size of the times table
        int multiplier;

        // Outer loop for rows (multiplicands)
        for (int multiplicand = 1; multiplicand <= tableSize; multiplicand++) {
            // Inner loop for columns (multipliers)
            for (multiplier = 1; multiplier <= tableSize; multiplier++) {
                int result = multiplicand * multiplier;
                System.out.printf("%4d", result); // Adjust the width as needed
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

