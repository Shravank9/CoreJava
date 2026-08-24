package com.vcubelab_dailytest;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the size of row size");
		int row = sc.nextInt();
		System.out.println("Enter the size of Column size");
		int col = sc.nextInt();

		System.out.printf("Enter the elements of matrix which %d x %d ", row, col);

		int[][] arr = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = sc.nextInt();

			}
		}

		int sum = 0;

		for (int x[] : arr) {
			for (int n : x) {
				sum += n;
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//
//				sum += arr[i][j];
//			}
//		}

		System.out.println("Sum of the Elements :" + sum);
		System.out.println(Arrays.deepToString(arr));

		sc.close();

	}

}
//
//Today's Assignment
//Java-
//1.Write a Java program to read a 3 × 3 
//matrix and find the sum of all its elements.
//Input:     1 2 3
//           4 5 6
//           7 8 9
//Output : Sum of all elements = 45
// display the matrix in the same format.
