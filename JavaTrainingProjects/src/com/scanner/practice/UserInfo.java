package com.scanner.practice;

import java.util.Scanner;

class UserInfo {
    private String userName;
    private String password;

    // Constructor
    public UserInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // Login method
    public boolean login(String inputUserName, String inputPassword) {
        if (inputUserName.equals(userName) && inputPassword.equals(password)) {
            return true; // Login successful
        } else if (inputUserName.equals(userName)) {
            System.out.println("Incorrect password.");
        } else {
            System.out.println("Invalid username.");
        }
        return false; // Login failed
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a user
        UserInfo user = new UserInfo("alifaizi", "abc@123");

        // Prompt for user input
        System.out.print("Enter username: ");
        String inputUserName = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Attempt to login
        boolean loginSuccessful = user.login(inputUserName, inputPassword);

        // Check if login was successful
        if (loginSuccessful) {
            System.out.println("Login successful! Welcome, " + inputUserName + "!");
        } else {
            System.out.println("Login failed. Please try again.");
        }

        // Close the scanner
        scanner.close();
    }
}