package com.Practice.taks1_25_09_26;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfCurrentAndNextElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.print("enter the array elemnts");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

//		int[] result = new int[arr.length];
//
//		for (int i = 0; i < arr.length; i++) {
//
//			if (i == 0) {
//
//				result[i] = arr[i] + arr[i + 1];
//			} else if (i == arr.length - 1) {
//				result[i] = arr[i] + arr[i - 1];
//			} else {
//				result[i] = arr[i] * 2;
//			}
//
//		}
//		System.out.println(Arrays.toString(result));

//		{30, 50, 70, 90, 110, 70}

		int a = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (i == arr.length - 1) {
				arr[i] = arr[i] + a;
			} else {
				arr[i] += arr[i + 1];
			}
		}
		System.out.println(Arrays.toString(arr));

		sc.close();

	}

}
//2.Write a Java Program to create  a new array where each 
//element is the sum of the current and next element of the given array?

//i/p: int arr[]={10,20,30,40,50,60};
//o/p:	{30,40,60,80,100,110};