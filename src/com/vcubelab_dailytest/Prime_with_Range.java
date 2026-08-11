package com.vcubelab_dailytest;
import java.util.Scanner;

public class Prime_with_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("Prime numbers between 1 and 50:");
		
		for(int j=1;j<=50;j++) {
		if (isprime(j)) {
			System.out.println(j+ " is a prime number");
		} 
		}
		sc.close();

	}

	static boolean isprime(int j) {
		boolean status = true;
		
		if (j == 0 || j == 1)
		{
			return false;
		}
		for (int i = 2; i < j; i++)
		{
			if (j % i == 0) 
			{
				status = false;
				break;
			}
		}
		return status;
	}

}

//
////Today's Assignment
////Java
//Today's Assignment
//Java
//1.write a java program to print given number is prime or not.
//
//2.write a java program to print prime numbers between range 1to 50.
