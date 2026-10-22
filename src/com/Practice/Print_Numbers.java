package com.Practice;

import java.util.Scanner;

public class Print_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number where to end it :");
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			System.out.print(i+" ");
		}

		sc.close();

	}

}

//Write a Java program to print:
//
//1 2 3 4 5 6 7 8 9 10
//
//Practice: for loop