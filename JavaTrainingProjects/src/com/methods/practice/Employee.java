package com.methods.practice;

public class Employee {
	
	/*
	 * Write a program in Java to show the object of an Employee with
	 * empName, 
	 * empId, 
	 * empAddress, 
	 * empSalary, 
	 * empPosition 
	 * fields and 
	 * HelpCustomers() and CallCustomers() 
	 * methods.
	 * Note: Assign your field value with constructor and give your methods return optional.
	 * Create object of 2 employees in main methods and call the fields and methods to print in the console.
	 */
	
	// Fields/Variables
	
    private String empName;
    private int empId;
    private String empAddress;
    private double empSalary;
    private String empPosition;

    // Constructor 
    public Employee(String empName, int empId, String empAddress, double empSalary, String empPosition) {
        this.empName = empName;
        this.empId = empId;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
        this.empPosition = empPosition;
    }

    // Method 1
    
    public String HelpCustomers() {
        
        return "Employee " + empName + " is helping customers.";
    }

    //Method 2
    public String CallCustomers() {
        
        return "Employee " + empName + " is calling customers.";
    }

    public static void main(String[] args) {
        
    	// Objects
    	
        Employee employee1 = new Employee("Ali", 101, "123 Alexandria", 50000.0, "Sales Person");
        Employee employee2 = new Employee("Faizi", 102, "456 Falls Church St", 60000.0, "Marketing Associate");

        // Object 1 Fields Print
        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + employee1.empName);
        System.out.println("ID: " + employee1.empId);
        System.out.println("Address: " + employee1.empAddress);
        System.out.println("Salary: $" + employee1.empSalary);
        System.out.println("Position: " + employee1.empPosition);
        
        // Method 1 invoked 
        String emp1Job = employee1.HelpCustomers();
        System.out.println(emp1Job);
    
        System.out.println("\nEmployee 2 Details:");
        System.out.println("Name: " + employee2.empName);
        System.out.println("ID: " + employee2.empId);
        System.out.println("Address: " + employee2.empAddress);
        System.out.println("Salary: $" + employee2.empSalary);
        System.out.println("Position: " + employee2.empPosition);
        
        // Method 2 invoked 
        String emp2Job = employee2.CallCustomers();
        System.out.println(emp2Job);
    }
}