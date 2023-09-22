package com.methods.practice;

public class MethodOverRidingChild extends MethodOverRidingParent{
	
	public String sound() {
		
		return "Mew Mew";
	}
	
	public static void main(String[] args) {
		
		MethodOverRidingChild obj = new MethodOverRidingChild();
		
		System.out.println(obj.sound());
	}

}
