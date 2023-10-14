package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListWithForEachRemaining {

	public static void main(String[] args) {

		ArrayList<String> studentArray = new <String>ArrayList();

		studentArray.add("Ahamd");
		studentArray.add("Mahmood");
		studentArray.add("Sarah");
		studentArray.add("Faizi");

		Iterator<String> studentName = studentArray.iterator();

		studentName.forEachRemaining(studentDetails -> {

			System.out.println(studentDetails);
		});
	}
}
