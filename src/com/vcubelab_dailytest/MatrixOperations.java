package com.vcubelab_dailytest;

import java.util.*;

public class MatrixOperations {
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
		int temp = 0;
		for (int i = 0; i < row; i++) {

			if (i % 2 == 0) {

				int left = 0;
				int right = arr[i].length - 1;

				while (left < right) {

					temp = arr[i][left];
					arr[i][left] = arr[i][right];
					arr[i][right] = temp;

					left++;
					right--;
				}
			} else {
				for (int j = 0; j < col; j++) {
					if (i != j) {

						arr[i][j] *= 2;

					}
				}
			}
		}
		for (int i = 0; i < row && i < col; i++) {
			arr[i][i] *= arr[i][i];
		}
		for (int x[] : arr) {
			for (int n : x) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}

//Today's Assignment
//
//Java-
//
//1.Write a Java program to perform the following operations on a 3 × 3 integer matrix:
//Reverse the elements of every even-indexed row (rows 0 and 2).
//Multiply every element of the odd-indexed row (row 1) by 2, except the middle element (1,1).
//Square all the elements on the main (left) diagonal.
//Display the modified matrix.
// Input
//1 2 3
//4 5 6
//7 8 9
// Output
//9   2   1
//8  25   12
//9   8  49
