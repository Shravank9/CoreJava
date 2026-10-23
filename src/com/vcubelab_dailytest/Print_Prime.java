package com.vcubelab_dailytest;

import java.util.Scanner;

public class Print_Prime 
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = sc.nextInt();

        int count = 0;

        for (int num = 2; count < n; num++) 
        {

            boolean prime = true;

            for (int i = 2; i < num; i++) 
            {

                if (num % i == 0) 
                {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
                count++;
            }
        }
    }
}