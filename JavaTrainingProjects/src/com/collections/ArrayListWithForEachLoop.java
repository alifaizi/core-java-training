package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListWithForEachLoop {

	public static void main(String[] args) {

		ArrayList<String> studentArray = new <String>ArrayList();

		studentArray.add("Ahamd");
		studentArray.add("Mahmood");
		studentArray.add("Sarah");
		studentArray.add("Faizi");
		
		for (String student1 : studentArray) {
			
			System.out.println(student1);
		}


	}
}