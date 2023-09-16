package com.mapperclass.practice;

public class StringClass {
	
	public static void main(String[] args) {
		
		// Length
		String str = "My name is Ali";
		System.out.println(str.length());
		
		System.out.println("--------------------------------------------");
		
		// Concatenation
		String a = "Book";
		String b = "Price";
		System.out.println(a.concat(", " + b));
		
		System.out.println("--------------------------------------------");
		
		// Converting String to Characters
		String name = "Hello";
		char [] charList = name.toCharArray();
		for(int i = 0; i< charList.length; i++)
		System.out.print(charList[i] + ",");
		
		System.out.println();
		
		System.out.println("--------------------------------------------");
		
		// Character based on its index
		String lastName = "Faizi";
		System.out.println(lastName.charAt(2));
		
		System.out.println("--------------------------------------------");
		
		// CopareTo: Comparing 2 strings
		Integer num1 = 5;
        Integer num2 = 10;

        int result = num1.compareTo(num2);

        if (result < 0) {
            System.out.println(num1 + " is less than " + num2);
        } else if (result == 0) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num1 + " is greater than " + num2);
        }
        
        System.out.println("--------------------------------------------");
        
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        int result1 = str1.compareTo(str2);
        int result2 = str1.compareTo(str3);

        if (result1 < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result1 == 0) {
            System.out.println(str1 + " is equal to " + str2);
        } else {
            System.out.println(str1 + " comes after " + str2);
        }

        if (result2 < 0) {
            System.out.println(str1 + " comes before " + str3);
        } else if (result2 == 0) {
            System.out.println(str1 + " is equal to " + str3);
        } else {
            System.out.println(str1 + " comes after " + str3);
        }
        
        System.out.println("--------------------------------------------");
        
        // Contains
        String x = "Write Test Case";
        String y = "Test";
        String z=  "Case";
        System.out.println(x.contains(y) && x.contains(z));
       
        System.out.println("--------------------------------------------");
        
        // Split
        String n = "This is xyz java class";
        String [] s = n.split("xyz");
        for(String t : s) {
        	System.out.println(t);
        }
        
        System.out.println("--------------------------------------------");
        
        // Index of
        String getIndexOf = "Welcome";
        System.out.println(getIndexOf.indexOf('c'));
        
        // String Reverse with StringBuffer
        String m = "Tom";
        StringBuffer sb = new StringBuffer(m);
        System.out.println(sb.reverse());
	}
	
}
