package com.vcubelab_dailytest;

import java.util.Scanner;

public class MatrixValueReplacement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the size of row size");
		int row = sc.nextInt();
		System.out.println("Enter the size of Column size");
		int col = sc.nextInt();

		if (row != col) {
			System.out.println("\"Matrix must be square.");
			sc.close();
			return;
		}
		System.out.printf("Enter the elements of matrix which %d x %d ", row, col);

		int[][] arr = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] % 2 == 0) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = -1;
				}

			}
		}
		for (int[] x : arr) {
			for (int n : x) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}

//Java-
//1.Write a Java program to read an N × N integer matrix from the user. 
//Replace every even number in the matrix with 0 and every odd number with -1. 
//Display the modified matrix.
//Input
//1 2 3
//4 5 6
//7 8 9
//Output
//-1  0  -1
//0  -1   0
//-1  0  -1
