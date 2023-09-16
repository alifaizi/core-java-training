package com.objects.practice;

public class Employees {
	
	/* We can assign values to variables in three ways:
	 * Through Assigning values
	 * With Constructor
	 * With Methods
	 */
	
	
	public String firstName = "Ali"; 
	public String lastName = "Faizi";
	public int age = 36;
	public char gender = 'M';
	public double salary = 5500.50;
	public String designation = "Team Lead";
	public String shift = "9 am to 5 pm";
	
	public String leadsTheTeam() {
		return "Manage team's day to day activities";
	}
	public String codeReview() {
		return "Reviews developers codes at 2:00pm everyday";
	}
	public String reviewPullRequest() {
		return "Reviews and approve the Pull Requests";
	}
	public String attendMeeting() {
		return "Attend daily standup meeting";	
	}
	public static void main(String[] args) {
		
		Employees devLead = new Employees();
		
		System.out.println("First Name: " + devLead.firstName);
		System.out.println("Last Name: " + devLead.lastName);
		System.out.println("Age: " + devLead.age);
		System.out.println("Gender: " + devLead.gender);
		System.out.println("Salary: " + devLead.salary);
		System.out.println("Position: " + devLead.designation);
		System.out.println("Work Shift: " + devLead.shift);
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println(devLead.leadsTheTeam());
		System.out.println(devLead.codeReview());
		System.out.println(devLead.codeReview());
		System.out.println(devLead.reviewPullRequest());
		System.out.println(devLead.attendMeeting()); 
	}
}
