package com.methods.practice;

public class MethodWithVoid {
	
	String name;
	
	public void myInfo() {
		
		name = StudentName();	
	}
	
//-----------------------------------------------------------------------------
	
	public String StudentName() {
		String sName = "Ali";
		return sName;
	}
	
	public static void main(String[] args) {
		
		MethodWithVoid myName = new MethodWithVoid();

	}

}
