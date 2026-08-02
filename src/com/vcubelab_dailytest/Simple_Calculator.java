package com.vcubelab_dailytest;

import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		
		System.out.println("Enter operator (+ or -):");
		char c=sc.next().charAt(0);
		String   result=(c=='+')?String.valueOf((a+b)):
			         (c=='-')?String.valueOf(a-b):"Invalid Operator";
		System.out.println("Result:"+result);
		sc.close();
		
		

	}

}

//
//Java Question:
//1.Write a Java program to create a simple calculator using the ternary operator. 
//The program should accept two numbers and an operator. If the operator is '+', perform addition; 
//otherwise, perform subtraction.
//
//Sample Input 1:
//Enter first number: 10
//Enter second number: 5
//Enter operator (+ or -): +
//Sample Output 1:
//Result: 15
//
//Sample Input 2:
//Enter first number: 20
//Enter second number: 8
//Enter operator (+ or -): -
//Sample Output 2:
//Result: 1