package com.vcubelab_dailytest;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRightsum {

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
		int sum1=0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i == j) {
					sum += arr[i][j];
				}
				if (i + j == row - 1) {
					sum1 += arr[i][j];
				}
			}
		}
		System.out.println("Left Diagonal sum:"+sum);
		System.out.println("Right Diagonal sum:"+sum1);


	}

}
