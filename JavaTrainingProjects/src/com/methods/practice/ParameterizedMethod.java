package com.methods.practice;

public class ParameterizedMethod {
	
	public String info(String fName, String lName) {
		
		return fName + lName;
	}
	
	public static void main(String[] args) {
		
		ParameterizedMethod myInfo = new ParameterizedMethod();
		
		System.out.println(myInfo.info("Ali ", "Faizi"));
	}

}
