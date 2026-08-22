package com.Practice.arrays.basic;

import java.util.Scanner;

public class HosiptalPatientTemperatureAnalysis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array:");

		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Array size mut be greater than zero");
			sc.close();
			return;
		}

		double[] temp = new double[size];

		System.out.printf("Enter %d array elements:%n", size);

		for (int i = 0; i < temp.length; i++) {
			temp[i] = sc.nextInt();
		}

		double temp_sum = 0;
		int count = 0;
		double lar = temp[0];
		double small = temp[0];
		double avg = 0;

		for (int i = 0; i < temp.length; i++) {
			temp_sum += temp[i];
			if (temp[i] >= 100.4) {
				count++;
			}

			if (temp[i] > lar) {
				lar = temp[i];
			} else if (small > temp[i]) {
				small = temp[i];

			}

		}
		avg = temp_sum / temp.length;
		System.out.println("Average: " + avg);
		System.out.println("Count:" + count);
		System.out.println("Largest:" + lar);
		System.out.println("Smallest:" + small);

		sc.close();

	}

}
