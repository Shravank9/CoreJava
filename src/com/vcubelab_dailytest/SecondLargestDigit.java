package com.vcubelab_dailytest;

import java.util.Scanner;

public class SecondLargestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=sc.nextInt();
		secondlargest_gigit(a);
		sc.close();

	}

	private static void secondlargest_gigit(int a) {
		
		int sec_largest=0;
		int first_largest=0;
		
		while(a>0) {
			int r=a%10;
			if(first_largest<r) {
				sec_largest=first_largest;
				first_largest=r;
				
			}else if( sec_largest<r && r < first_largest){
				sec_largest=r;
			}
			a/=10;
		}
		System.out.println("Second Largest Number is: "+sec_largest);

		
	}

}

//1. Find the Second Largest Digit in a Number.
//Definition:
//Given a number, find the second largest distinct digit present in it.
//Input : 987654
//Output : 8