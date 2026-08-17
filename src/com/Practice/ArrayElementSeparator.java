package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementSeparator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the Array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int p_count = 0;
		int n_count = 0;
		int z_count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				p_count++;
			} else if (arr[i] < 0) {
				n_count++;
			} else {
				z_count++;
			}

		}
		int[] pos_arr = new int[p_count];
		int[] neg_arr = new int[n_count];
		int[] zero_arr = new int[z_count];
		
		int p = 0;
		int n = 0;
		int z = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos_arr[p++] = arr[i];
			} else if (arr[i] < 0) {
				neg_arr[n++] = arr[i];
			} else {
				zero_arr[z++] = arr[i];
			}

		}
		System.out.println("Positive: " + Arrays.toString(pos_arr));
		System.out.println("Negative: " + Arrays.toString(neg_arr));
		System.out.println("Zero: " + Arrays.toString(zero_arr));

		sc.close();

	}

}

//Problem: Separate Array Elements
//
//Given an integer array, separate its elements into three arrays:
//
//Positive array → stores numbers greater than 0
//Negative array → stores numbers less than 0
//Zero array → stores numbers equal to 0
//
//Example:
//
//Input:
//[5, -2, 0, 8, -7, 3, 0]
//
//
//Output:
//Positive: [5, 8, 3]
//Negative: [-2, -7]
//Zero: [0, 0]