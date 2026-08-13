package com.vcubelab_dailytest;

import java.util.Scanner;

public class Largest_Number {
	
	
	
	public static int largestdigit(int a) {
		int largest=0;
		int r=0;
		
		while(a>0) {
			r=a%10;
			a/=10;
			
			if(r>largest) {
				largest=r;
			}
		}
		
		return largest;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=sc.nextInt();
		int c=largestdigit(a);
		System.out.println("Largest Digit is:"+c);
		sc.close();
		

	}

}



//Today's Assignment
//Java-
//1.Find the Largest Digit in a Number
//Input : 983742
//Output : Largest Digit = 9 

