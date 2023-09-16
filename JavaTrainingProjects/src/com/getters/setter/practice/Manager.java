package com.getters.setter.practice;

public class Manager {
	
	
	private String fName;
	private String lName;
	
	// We assign our fields value with Setter Method
	// We access our fields value with Getter Method
	
	// Generate getter and setter methods
	// Getters and Setters only used in encapsulation (OOPs Concept)
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
	// We can use the following code in another class (AllManagers)
	
//	public static void main(String[] args) {

//		Manager obj1 = new Manager();
//		
//		obj1.setfName("Ali");
//		obj1.setlName("Faizi");
//		
//		System.out.println(obj1.getfName());
//		System.out.println(obj1.getlName());
//		
		
		
//	}

}
