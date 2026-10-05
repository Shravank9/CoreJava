package com.Practice.arrays.basic;

import java.util.Scanner;

public class CountPositiveNegativeZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int p_count = 0;
		int n_count = 0;
		int z_count = 0;

		for (int n : arr) {
			if (n > 0) {
				p_count++;

			} else if (n < 0) {
				n_count++;
			} else {
				z_count++;
			}
		}

		System.out.println("Positive: " + p_count);
		System.out.println("Negative: " + n_count);
		System.out.println("Zero: " + z_count);

		sc.close();
	}

}

//Problem: Count Positive, Negative and Zero Elements
//
//Given an integer array, count how many elements are positive,
//negative, and zero.
//
//Input:
//7
//5 -2 0 8 -7 3 0
//
//Output:
//Positive: 3
//Negative: 2
//Zero: 2
