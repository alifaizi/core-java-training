package com.methods.practice;

public class UserRegistration {
	

	/*
	 * Write a program to show the userRegitration.
	 * Create a class and name it User Registration and firstName, lastName, userName, userPassword, userEmail, userAddress, userCellPhone
	 * are fields and method is register()
	 * Assign Values to the variables through constructor
	 * Create your object in main method and call your variables and method and then print them in the console
	 */
	
	    public String firstName;
	    public String lastName;
	    public String userName;
	    public String userPassword;
	    public String userEmail;
	    public String userAddress;
	    public String userCellPhone;

	    public UserRegistration(String firstName, String lastName, String userName, String userPassword,
	                            String userEmail, String userAddress, String userCellPhone) {
	    	
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.userName = userName;
	        this.userPassword = userPassword;
	        this.userEmail = userEmail;
	        this.userAddress = userAddress;
	        this.userCellPhone = userCellPhone;
	    }

	    public String register() {
	       
	    	return "User registered successfully!";
	    }

	    public static void main(String[] args) {
	    	
	        UserRegistration user = new UserRegistration("Ali", "Faizi", "alifaizi", "pass123",
	                "alifaizi@kayhanacademy.com", "123 Main St, Alexandria, VA", "123-456-7890");

	        System.out.println("First Name: " + user.firstName);
	        System.out.println("Last Name: " + user.lastName);
	        System.out.println("User Name: " + user.userName);
	        System.out.println("User Password: " + user.userPassword);
	        System.out.println("User Email: " + user.userEmail);
	        System.out.println("User Address: " + user.userAddress);
	        System.out.println("User Cell Phone: " + user.userCellPhone);

	        System.out.println(user.register());
	    }
	}