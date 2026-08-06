package com.vcubelab_dailytest;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=number_check(a);
		sc.close();
		
	}

 static int number_check(int a) {
         int c=Math.powExact(a,2);
         int sum=0;
         int digit=0;
         for(;c>0;c=c/10) {
           digit  =c%10;
           sum+=digit;
        	 
         }
         if (sum==a) {
        	 System.out.printf("%d  is a Neon Number",a);
         }else {
        	 System.out.printf(" %d is   Not a Neon Number",a);
         }
		return 0;
	}

}


//Java Task
//Question:
//1.Write a Java program to check whether a given number is a Neon Number.
//A Neon Number is a number where the sum of the digits of its square is equal to the original number.
//Sample Input 1
//Enter a number: 9
//Sample Output 1
//9 is a Neon Number.
//Explanation:
//9² = 81
//8 + 1 = 9
//Sample Input 2
//Enter a number: 10
//Sample Output 2
//10 is not a Neon Number.
//Explanation:
//10² = 100
//1 + 0 + 0 = 1 ≠ 10
