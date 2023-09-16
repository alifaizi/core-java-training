package com.getters.setter.practice;

public class productDetails {

	public static void main(String[] args) {
        // Create three objects of the Product class
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        // Set values for the fields using setter methods
        product1.setProductName("Product A");
        product1.setProductID(101);
        product1.setProductPrice(19.99);
        product1.setProductExpirationDate("2021-9-8");

        product2.setProductName("Product B");
        product2.setProductID(102);
        product2.setProductPrice(29.99);
        product2.setProductExpirationDate("2022-9-8");

        product3.setProductName("Product C");
        product3.setProductID(103);
        product3.setProductPrice(9.99);
        product3.setProductExpirationDate("2023-9-8");

        // Print the field values using getter methods
        System.out.println("Product 1 Details:");
        System.out.println("Name: " + product1.getProductName());
        System.out.println("ID: " + product1.getProductID());
        System.out.println("Price: $" + product1.getProductPrice());
        System.out.println("Expiration Date: " + product1.getProductExpirationDate());
        
        System.out.println("-------------------------------------------------");

        System.out.println("\nProduct 2 Details:");
        System.out.println("Name: " + product2.getProductName());
        System.out.println("ID: " + product2.getProductID());
        System.out.println("Price: $" + product2.getProductPrice());
        System.out.println("Expiration Date: " + product2.getProductExpirationDate());
        
        System.out.println("-------------------------------------------------");

        System.out.println("\nProduct 3 Details:");
        System.out.println("Name: " + product3.getProductName());
        System.out.println("ID: " + product3.getProductID());
        System.out.println("Price: $" + product3.getProductPrice());
        System.out.println("Expiration Date: " + product3.getProductExpirationDate());
    }
}
