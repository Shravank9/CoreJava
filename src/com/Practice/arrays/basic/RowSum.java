package com.Practice.arrays.basic;

import java.util.Scanner;

public class RowSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of row:");
		int row = sc.nextInt();

		System.out.println("Enter the size of col");
		int col = sc.nextInt();

		if (row < 1 || col < 1) {
			System.out.println("it should contaion atleast one element");
			sc.close();
			return;
		}

		int[][] arr = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int rowsum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rowsum += arr[i][j];
			}
			System.out.println("Rowsum:" + rowsum);

		}

		sc.close();
	}

}
//Topic: 2D Arrays
//Problem 1: Find the sum of each row in a matrix.
//Class Name: RowSum
//Required Loop: nested for loop
//
//Input:
//1  2  3
//4  5  6
//7  8  9
//
//Output:
//Row 1 Sum: 6
//Row 2 Sum: 15
//Row 3 Sum: 24
//
//Edge Cases:
//1x1 matrix
//1 row with multiple columns
//Multiple rows with 1 column
//Negative values
//Zeros