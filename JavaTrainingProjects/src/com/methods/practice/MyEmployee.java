package com.methods.practice;

public class MyEmployee {
	

	public String showEmployeeHourlyPay(int id, String name, int workHOurs, int hourlyPay) {
		
		return "Employee Id: " + id + "\n" + "Employee Name: " + name + "\n" + "Pay Per Hour: " + hourlyPay + "\n" + "Work Hour Per Day: " 
		+ workHOurs + "\n" + "Total Pay Per Day: " + 
		+ workHOurs * hourlyPay;
	}
	
	public static void main(String[] args) {
			
		MyEmployee emp1 = new MyEmployee();
		MyEmployee emp2 = new MyEmployee();
		
		String emp1Pay = emp1.showEmployeeHourlyPay(1234, "Joe Fuller", 8, 45);
		String emp2Pay = emp2.showEmployeeHourlyPay(56789, "Ali Faizi", 8, 50);
		
		System.out.println(emp1Pay);
		
		System.out.println("\n");
		
		System.out.println(emp2Pay);
		
		
	}

}
