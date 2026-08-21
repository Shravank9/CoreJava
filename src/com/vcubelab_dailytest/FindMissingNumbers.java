package com.vcubelab_dailytest;

import java.util.Scanner;

public class FindMissingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Array size mut be greater than zero");
			sc.close();
			return;
		}

		int[] arr = new int[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int lar = arr[0];

		for (int x : arr) {
			if (x > lar) {
				lar = x;
			}
		}

		for (int i = 1; i <=lar; i++) {
			boolean check = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					check = true;
					break;

				}
				

				}
			if (!check) {
				System.out.println(i);

			}

		}

		sc.close();

	}

}
