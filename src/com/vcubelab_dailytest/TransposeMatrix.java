package com.vcubelab_dailytest;

import java.util.Scanner;

public class TransposeMatrix {

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

		System.out.println("Original Matrix:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("Transpose Matrix:");
		System.out.println("__________________________________");

		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

		sc.close();
	}

}

//Today's Assignment
//Java-

//1.Write a Java program to read a 3 × 3 matrix using the Scanner class and find its transpose.
//The transpose of a matrix is obtained by interchanging its rows and columns. In other words, the element at position (i, j) becomes (j, i).
//Original Matrix:
//1 2 3
//4 5 6
//7 8 9
//Transpose Matrix:
//1 4 7
//2 5 8
//3 6 9
