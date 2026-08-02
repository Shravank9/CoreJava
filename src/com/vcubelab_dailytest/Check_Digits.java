package com.vcubelab_dailytest;

import java.util.Scanner;

public class Check_Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		
		if(a<10) {
			System.out.println("It is One Digit Number");
		}else if(a<100) {
			System.out.println("It is Two Digit Number ");
		}else if(a<1000) {
			System.out.println("It is Three Digit Number ");
		}
		else {
			System.out.println("More Than Three Digits ");
			
		}
		sc.close();
		
		

	}

}

//Java
//Question:
//1.Write a Java program to check whether a given number is a two-digit, three-digit, 
//or more than three digits using if-else if statements.
//1.The program should:
//Accept an integer as input.
//Display:
//2.Two-Digit Number if the number has 2 digits.
//3.Three-Digit Number if the number has 3 digits.
//4.More Than Three Digits if the number has more than 3 digits.
//5.Less Than Two Digits if the number has only 1 digit
