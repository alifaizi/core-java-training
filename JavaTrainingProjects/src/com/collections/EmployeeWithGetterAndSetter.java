package com.collections;

public class EmployeeWithGetterAndSetter {

	private String firstName;
	private String lastName;
	private int age;
	private String address;

	public EmployeeWithGetterAndSetter(String firstName, String lastName, int age, String address) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
