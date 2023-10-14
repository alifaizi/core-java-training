package com.collections;

import java.util.*;

public class ArrauListExample {
	
	public static void main(String[] args) {
		
		// collection name + data type + your array name + = new + data type + constructor
		
		ArrayList <String> mySTR = new <String> ArrayList();
		
		mySTR.add("Ali");
		mySTR.add("Wali");
		mySTR.add("Kamal");
		mySTR.add("Tamanna");
		mySTR.add("Mahmood");
		mySTR.add("Sarah");
		
		Iterator a = mySTR.iterator();
		while (a.hasNext()) {
		
		System.out.println(a.next());
		}
		
		System.out.println("----------------------------------");
		
		System.out.println(mySTR.remove(3));
		System.out.println(mySTR);
		System.out.println(mySTR.get(3));
		System.out.println(mySTR.get(4));
		
		System.out.println("--------------------------");
		
		ArrayList <Integer> aptNum = new <Integer> ArrayList();
		aptNum.add(22);
		aptNum.add(25);
		aptNum.add(53);
		aptNum.add(76);
		aptNum.add(2, 123);
		
		System.out.println(aptNum.add(900));
		System.out.println(aptNum);
		System.out.println(aptNum.get(2));
		
	}

}
