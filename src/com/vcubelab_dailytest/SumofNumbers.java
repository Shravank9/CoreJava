package com.vcubelab_dailytest;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number where you want from start it!");
		int a=sc.nextInt();
		System.out.println("Enter your number where you want from End it!");
		int b=sc.nextInt();
		int sum=0;
		
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		System.out.println("Sum:"+sum);
		sc.close();
	}

}



//Today's Assignment
//Java
//2.write a java program to Find the sum of numbers from 1 to 100.
//Output: 5050