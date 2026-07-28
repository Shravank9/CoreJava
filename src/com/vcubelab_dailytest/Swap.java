package com.vcubelab_dailytest;
import java.util.Scanner;


public class Swap {
	
	int a;
	int b;
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Swap t=new Swap();
		System.out.println("Enter the value of the a");
		t.a=sc.nextInt();
		System.out.println("Enter the value of the b");
		t.b=sc.nextInt();

		System.out.println("Before Swapping:");
		System.out.println("A = " + t.a);
		System.out.println("B = " + t.b);

		t.a = t.a + t.b;
		t.b = t.a - t.b;
		t.a = t.a - t.b;

		System.out.println("After Swapping:");
		System.out.println("A = " + t.a);
		System.out.println("B = " + t.b);
		
		
		

	}

}

//
//1.Write a Java program to swap two numbers without using a third variable.
//Input:
//A = 10
//B = 20
//
//Output:
//Before Swapping:
//A = 10
//B = 20
//
//After Swapping:
//A = 20
//B = 10
