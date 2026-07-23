/*

2.Initialize all the values using a parameterized constructor.
3.Create a method to calculate and display the 
4.Total Hospital Bill using the following formula:
Total Hospital Bill = Room Charge Per Day × Number of Days Admitted
5.Read the values using the Scanner class, create an object by passing the values to the parameterized constructor, 
and display all the patient details along with the total hospital bill.

Sample Input:
Enter Patient Name: Rahul
Enter Age: 35
Enter Room Charge Per Day: 2500
Enter Number of Days Admitted: 4

Expected Output:
Patient Name          : Rahul
Age                   : 35
Room Charge Per Day   : 2500.0
Days Admitted         : 4
Total Hospital Bill   : 10000.0*/



package com.vcubelab_dailytest;
import java.util.Scanner;

public class Patient {
	String Name;
	int Age;
	double Room_Charge_Per_Day;
	int Number_of_Days_Admitted;
	
	Patient(String Name,int Age,double Room_Charge_Per_Day,int Number_of_Days_Admitted){
		System.out.println("Parameterized Constructor is Called");
		this.Name=Name;
		this.Age=Age;
		this.Room_Charge_Per_Day=Room_Charge_Per_Day;
		this.Number_of_Days_Admitted=Number_of_Days_Admitted;
		
	}
	double calculate() {
		double c=Room_Charge_Per_Day * Number_of_Days_Admitted;
		return c;
		
	}
	void display() {
		System.out.println("---------------------------------");
		System.out.println("Patient Name          :"+Name);
		System.out.println("Age                   :"+Age);
		System.out.println("Room Charge Per Day   :"+Room_Charge_Per_Day);
		System.out.println("Days Admitted         :"+Number_of_Days_Admitted);
		
	}

	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Patient Name:");
		String Name=sc.nextLine();
		System.out.println("Enter Age:");
		int Age=sc.nextInt();
		System.out.println("Enter Room Charge Per Day:");
		double Room_Charge_Per_Day=sc.nextDouble();
		System.out.println("Enter Number of Days Admitted:");
		int Number_of_Days_Admitted=sc.nextInt();
		
		
		
		Patient t=new Patient(Name,Age,Room_Charge_Per_Day,Number_of_Days_Admitted);
		t.display();
		System.out.println("Total Hospital Bill   :"+ t.calculate());
		System.out.println("Main Method ended");
		

	}
	

}
