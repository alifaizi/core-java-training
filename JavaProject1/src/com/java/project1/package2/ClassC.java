package com.java.project1.package2;

import com.java.project1.package1.*;

public class ClassC extends ClassA {
	
	public static void main(String[] args) {
		
		// Access age value from ClassA in the package 1
			
			ClassC obj = new ClassC();
			
			System.out.println(obj.age);
		}

	}
