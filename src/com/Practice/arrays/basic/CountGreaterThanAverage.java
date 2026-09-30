package com.Practice.arrays.basic;

import java.util.Scanner;

public class CountGreaterThanAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Array size mut be greater than zero");
			sc.close();
			return;
		}

		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		double avg = 0;
		int count = 0;

		for (int n : arr) {
			sum += n;

		}
		avg = (double) sum / arr.length;

		System.out.println("Average: " + avg);

		for (int n : arr) {
			if (n > avg) {
				count++;
			}
		}
		System.out.println("Elements greater then Average: " + count);

		sc.close();

	}

}

//Problem:
//Given an integer array, calculate the average of all elements
//and count how many elements are greater than the average.
//
//Example:
//Input: {10, 20, 30, 40, 50}
//Average: 30.0
//Output: 2
