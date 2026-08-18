package com.vcubelab_dailytest;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		boolean status=automorphic_Number(number);
		if(status) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not an Automorphic Number");
		}
		sc.close();
	}
	
	static boolean automorphic_Number(int number) {
		boolean  status=false;
		
		
		int squr=number*number;
		int temp=number;
	    int digit=0;
		
		while(number>0) {
			int r=number%10;
			digit++;
			number/=10;
		}
        int power = (int) Math.pow(10, digit);

		if(squr%power==temp) {
			status=true;
		}
		
		
		return status;
		
	}

}

//Java-
//
//1.Check if a Number is an Automorphic Number.
//Definition:
//A number is called an Automorphic Number if the square of the number ends with the same number.
//Input:25 =>25 × 25 = 625
//                   625 ends with 25
//Output : Automorphic Number
