package com.vcubelab_dailytest;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the a String");
		String s = sc.nextLine();
		String rstr = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			rstr = c + rstr;

		}
		System.out.println("Reversed String -> " + rstr);

	}
}
//Today's Assignment 
//
//Java
//
//1.Write a Java program to reverse a given string without using the built-in reverse() method.
//Input: Hello
//Output: olleH
//
//Input: Java Programming
//Output: gnimmargorP avaJ