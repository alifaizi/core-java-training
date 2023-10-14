package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListWithForLoop {

	public static void main(String[] args) {

		ArrayList<String> studentArray = new <String>ArrayList();

		studentArray.add("Ahamd");
		studentArray.add("Mahmood");
		studentArray.add("Sarah");
		studentArray.add("Faizi");
		
		for (int i = 0; i < studentArray.size(); i++) {
			System.out.println(studentArray.get(i));
			
		}
		}


	}