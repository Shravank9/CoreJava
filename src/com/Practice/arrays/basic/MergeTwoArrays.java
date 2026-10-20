package com.Practice.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size1 = sc.nextInt();

		System.out.println("Enter the size of an Array");
		int size2 = sc.nextInt();

		System.out.println("Enter  Array 1 Elements");
		int[] arr1 = new int[size1];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();

		}

		System.out.println("Enter  Array 2 Elements");
		int[] arr2 = new int[size2];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();

		}

		int[] barr = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			barr[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			barr[arr1.length + i] = arr2[i];
		}

		System.out.println(Arrays.toString(barr));

		sc.close();

	}

}
//Given two integer arrays, merge them into a single array
//containing all elements of both arrays.
//
//Example:
//Array 1: {1, 2, 3}
//Array 2: {4, 5, 6}
//Output:  {1, 2, 3, 4, 5, 6}
