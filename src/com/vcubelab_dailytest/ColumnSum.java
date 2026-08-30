package com.vcubelab_dailytest;

import java.util.Scanner;

public class ColumnSum {

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
		
		
		for(int j=0;j<arr[0].length;j++) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i][j];
			}
			System.out.printf("Column Sum Of %d ",j);
			System.out.println(sum);
		}
		
		
	
				

		sc.close();

	}

}
