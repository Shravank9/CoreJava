package com.vcubelab_dailytest;

import java.util.Scanner;

public class Count_digits {
	
	 static void show_count(int a) {
		 int count=0;
		 for (; a != 0; a = a / 10) {
		        count++;
		    }
		 System.out.println("Number of Digits:"+count);
		 
		 
	 }
	 
	 
	 

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		show_count(a);
		show_sum(a);
		sc.close();

	}




	static void show_sum(int a) {
		
		int digit=0;
		for (; a != 0; a = a / 10) {
			
			digit += a%10;
			
			
		}
		System.out.println("Sum of Digits:"+digit);
		
	}

}



//Today Task
//Java 
//1.Count the digits in a number.
//Input
//Enter a number: 12345
//Output
//Number of Digits: 5
//2.Find the sum of digits of a number.
//
//Input
//Enter a number: 1234
//Output
//Sum of Digits: 10
