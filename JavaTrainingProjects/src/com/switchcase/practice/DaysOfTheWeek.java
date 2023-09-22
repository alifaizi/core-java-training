package com.switchcase.practice;

public class DaysOfTheWeek {

	public String showDaysOfTheWeek() {

		int day = 9;
		String dayName;

		switch (day) {

		case 1:
			dayName = "Monday";
			break;

		case 2:
			dayName = "Tuesday";
			break;

		case 3:
			dayName = "Wednesday";
			break;

		case 4:
			dayName = "Thursday";
			break;

		case 5:
			dayName = "Friday";
			break;

		case 6:
			dayName = "Saturday";
			break;

		case 7:
			dayName = "Sunday";
			break;

		default:
			dayName = "Wrong entry";

		}

		return dayName;
	}

	public static void main(String[] args) {

		DaysOfTheWeek weekDay = new DaysOfTheWeek();

		String day = weekDay.showDaysOfTheWeek();

		System.out.println(day);

	}

}
