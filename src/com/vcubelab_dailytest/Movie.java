
/*Today Task
Java
Movie Ticket Details
1.Write a Java program to store the following movie ticket details in appropriate variables:
Ticket ID
Screen Number
Ticket Price
Online Booking Status
Viewer Age
Number of Tickets
Contact Number
GST Amount
2.Print all the ticket details in a clear and readable format.*/


package com.vcubelab_dailytest;

public class Movie {
	
	int tid;
	int snumber;
	double tprice;
	char Booking_Status;
	int age;

	long number;
	float gst;
	
	public static void main(String[] args) {
		
		Movie t=new Movie();
		t.tid=1014;
		t.snumber=01;
		t.tprice=150.56;
		t.Booking_Status='y';
		t.age=21;
		t.number=9013014101L;
		t.gst=1.8f;
		
		System.out.println("Ticket Number:"+t.tid);
		System.out.println("Screen number:"+t.snumber);
		System.out.println("ticket price:"+t.tprice);
		System.out.println("Booking Status:"+t.Booking_Status);
		System.out.println("Age:"+t.age);
		System.out.println("Ticket Number:"+t.number);
		System.out.println("Number:"+t.number);
		System.out.println("GST:"+t.gst);
		System.out.println("________________________________________________");
		
		

	}

}
