package com.vcubelab_dailytest.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CapitalizeFirstLetterOfEachWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String :");
		String str = sc.nextLine();

		char[] result = str.toCharArray();

		for (int i = 0; i < result.length; i++) {

			char ch = str.charAt(i);

			if (i == 0 || str.charAt(i - 1) == ' ') {

				if (ch >= 'a' && ch <= 'z') {

					ch = (char) (ch - 32);
				}
			}
			result[i] = ch;

			

		}
		System.out.println(Arrays.toString(result));
		sc.close();
	}

}
//2.Capitalize the first letter of each word without using uppercase method
//Input : "java is awesome"
//Output : "Java Is Awesome"