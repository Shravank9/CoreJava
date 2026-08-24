package com.vcubelab_dailytest;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDisplay {

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
		
		System.out.println(Arrays.deepToString(arr));

		for (int x[] : arr) {
			for (int n : x) {
				System.out.print(n);
			}
			System.out.println();
		}
	}

}
//Today's Assignment
//Java-
//
//2.Write a Java program to read the elements of a 3 × 3 
//matrix using the Scanner class and display the matrix in the same format.