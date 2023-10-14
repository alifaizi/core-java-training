package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListWithListIterator {

	public static void main(String[] args) {

		ArrayList<String> studentArray = new <String>ArrayList();

		studentArray.add("Ahamd");
		studentArray.add("Mahmood");
		studentArray.add("Sarah");
		studentArray.add("Faizi");

		ListIterator<String> myList = studentArray.listIterator();

		while (myList.hasNext()) {
			String studentList = myList.next();
			System.out.println(studentList);
		}

	}
}