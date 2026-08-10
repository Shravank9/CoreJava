package com.vcubelab_dailytest;

import java.util.Scanner;

public class Even_Numbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number where you want from start it!");
		int a=sc.nextInt();
		System.out.println("Enter your number where you want from End it!");
		int b=sc.nextInt();
		for(int i=a;i<b;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}



//Today's Assignment
//Java
//1.write a java program to print even numbers between 1 to 100.
//.
//Output: 5050