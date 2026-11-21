package com.vcubelab_dailytest.Strings;

import java.util.Scanner;

public class Palindrome_bytes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String:");
		String str = sc.nextLine();

		byte[] strbytes = str.getBytes();
		String rstr = "";

		for (byte s : strbytes) {

			rstr = (char)s + rstr;

		}
		System.out.println("Reversed String -> "+rstr);

		sc.close();
	}

}
