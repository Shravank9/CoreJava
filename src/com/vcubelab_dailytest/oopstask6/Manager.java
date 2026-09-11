package com.vcubelab_dailytest.oopstask6;

public class Manager implements Attendance{

	@Override
	public void markAttendance() {
		System.out.println("Attendance from the Manager");
	}

}
//Today's Assignment
//Java-
//1.A company records attendance for different employees.
//Create an interface Attendance with method markAttendance().
//Implement Developer, Tester, and Manager.
//Display attendance messages with employee roles.
