package com.vcubelab_dailytest.Strings;

import java.util.Scanner;

public class StringArrayPalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number of Strings:");
		int n = sc.nextInt();

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		String[] rstr = new String[n];

		for (int i = 0; i < arr.length; i++) {

//		    String s = arr[i];
			String rev = "";

			for (int j = 0; j < arr[i].length(); j++) {
//		        rev =  s.charAt(j)+rev ;
				rev = arr[i].charAt(j) + rev;
			}

			rstr[i] = rev;

			if (rev.equalsIgnoreCase(arr[i])) {
				System.out.println(arr[i] + " : True");
			} else {
				System.out.println(arr[i] + " : False");
			}
		}

		sc.close();

	}

}
//Today's Assignment
//
//Java
//1.Check if Given Array of Strings are Palindromes
//     Example: Input: ["madam", "hello", "civic"] → Output: {"madam": True, "hello": False, "civic": True}