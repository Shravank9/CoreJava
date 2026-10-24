package com.Practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		a=Math.abs(a);
		int r=0;
		for(;a>0;a/=10) {
			 r=a%10;
			System.out.print(r);
		}
		sc.close();

	}

}

//Reverse a number
//
//Class name: ReverseNumber
//
//Input:
//
//Enter number: 1234
//
//Expected output:
//
//Reverse = 4321
