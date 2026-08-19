package com.Practice.arrays.basic;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int arr_sum = 0;
		int avg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr_sum += arr[i];

		}
		avg = arr_sum / arr.length;
		System.out.println("Average: " + avg);

		sc.close();

	}

}

//Problem: Find the Average of Array Elements
//
//Given an integer array, find and display the average
//of all elements.
//
//Input:
//5
//10 20 30 40 50
//
//Output:
//Average: 30.0
