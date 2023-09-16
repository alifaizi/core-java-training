package com.getters.setter.practice;

public class Product {

	/*
	 * Write a program to show the object of a Product, 
	 * Create productName, productID, productPrice, productExpirationDate as fields.
	 * Assign values to the fields using setters and print the fields values using getter method.
	 * Create main class and named it producDetails and in the main method.
	 * Create 3 objects of Product class and call the setter methods and getter methods to print in the console.
	*/
	
	private String productName;
    private int productID;
    private double productPrice;
    private String productExpirationDate;

    // Setter methods
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductExpirationDate(String productExpirationDate) {
        this.productExpirationDate = productExpirationDate;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductExpirationDate() {
        return productExpirationDate;
    }
}
