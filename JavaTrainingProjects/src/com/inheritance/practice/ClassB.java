package com.inheritance.practice;

public class ClassB extends ClassA implements InterfaceD{
	
	public ClassB (String name, String address) {
		
		super(name, address);
		
	}
	
	public static void main(String[] args) {
		
		ClassB obj1 = new ClassB("Ahmad", "VA");
		
		System.out.println(obj1.name);
		System.out.println(obj1.address);
		System.out.println(obj1.village);
	}

}
