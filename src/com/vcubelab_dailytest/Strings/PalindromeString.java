package com.vcubelab_dailytest.Strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the a String");
		String s = sc.nextLine();
		String rstr = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			rstr = c + rstr;

		}
		if (rstr.equalsIgnoreCase(s)) {
			System.out.println(s + " is a Palindrome");

		}else {
			System.out.println(s+" is not a Palindrome");
		}
		sc.close();
	}

}
//2.Write a Java program to check whether a given string is a palindrome or not.
//A palindrome is a string that reads the same from left to right and right to left.
//Input: madam
//
//Output: madam is a Palindrome