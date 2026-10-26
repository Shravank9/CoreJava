package com.vcubelab_dailytest;

import java.util.Scanner;

public class RowSum {

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


		
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.printf("Row Sum Of %d: ",i);
			System.out.println(sum);
			
		}
		
		sc.close();;
	}

}
