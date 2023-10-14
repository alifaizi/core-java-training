package com.encapsulation;

public class AnimalDetails {
	
	public static void main(String[] args) {
		
		Animal obj = new Animal();
		
		obj.setName("Cat");
		obj.setWeight("5 lb");
		obj.setNumberLeg("4 legs");
		
		System.out.println(obj.getName());
		System.out.println(obj.getWeight());
		System.out.println(obj.getNumberLeg());
	}

}
