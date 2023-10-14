package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIterator {

	public static void main(String[] args) {

		ArrayList<String> studentArray = new <String>ArrayList();

		studentArray.add("Ahamd");
		studentArray.add("Mahmood");
		studentArray.add("Sarah");
		studentArray.add("Faizi");

		Iterator<String> s = studentArray.iterator();

		while (s.hasNext()) {
			System.out.println(s.next());
		}

	}
}
