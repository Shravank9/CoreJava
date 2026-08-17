package com.vcubelab_dailytest;
import java.util.Scanner;

public class Magic_Number1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		boolean magic = magicnumber(a);
		if (magic) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Not a Magic Number");
		}

		sc.close();
	}

	private static boolean magicnumber(int a) {
		
		if(a<10) {
			return a==1;
		}
		int sum=0;
		while(a>0) {
			int r=a%10;
			sum+=r;
			a/=10;
		}
		return magicnumber(sum);
		
		
	}

}

//Today's Assignment
//Java - 
//1.Write a Java program to check whether a given number is a Magic Number.
//definition - A Magic Number is a number whose repeated sum of digits becomes 1.
//Input - 1729=> 1 + 7 + 2 + 9 = 19
//                         1 + 9 = 10
//                         1 + 0 = 1
//output - Magic Number