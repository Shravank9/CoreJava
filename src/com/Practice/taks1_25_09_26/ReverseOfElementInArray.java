package com.Practice.taks1_25_09_26;

import java.util.Scanner;

public class ReverseOfElementInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of an array:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elments in the array:");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			int result = 0;

			while (num > 0) {

				int digit = num % 10;
				result = result * 10 + digit;
				num /= 10;
			}
			System.out.print(result + " ");
		}

		sc.close();

	}

}
//Today's Assignment
//Java-
//1.Write a Java program to print Reverse of Element in the Given Array?
//i/p: int arr[]={11,12,13,14,15,16}; 
//o/p:	{11,21,31,41,51,61};
