package com.Practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Upto Which numbers do you want to print!");
		int a = sc.nextInt();
		fibonacciSeries(a);

//		int a1=0;
//		int a2=1;
//		int a3=0;
//		System.out.print(a1+" "+a2+" ");
//		for(int i=0;i<a-2;i++) {
//			a3=a1+a2;
//			System.out.print(a3+" ");
//			a1=a2;
//			a2=a3;
//		}
//		here i have written the code in main method no need write method ,
//		if you want method to write in method written ,it down check it out
		sc.close();
	}

	static void fibonacciSeries(int a) {

		int a1 = 0;
		int a2 = 1;
		int a3 = 0;

		System.out.print(a1 + " " + a2 + " ");
		for (int i = 0; i < a - 2; i++) {
			a3 = a1 + a2;
			System.out.print(a3 + " ");
			a1 = a2;
			a2 = a3;
		}

	}

}
