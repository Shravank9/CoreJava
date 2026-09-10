package com.vcubelab_dailytest.oopstask7_10_09_26;

import java.util.Scanner;

import com.vcubelab_dailytest.oopstask6.Attendance;
import com.vcubelab_dailytest.oopstask6.Developer;
import com.vcubelab_dailytest.oopstask6.Manager;
import com.vcubelab_dailytest.oopstask6.Tester;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("which one do u want to select attendance? ");
			System.out.println("1)Electronics\n2)Clothing\n3)Furniture\n4)Exit");

			System.out.println("Enter the choice :");
			int choice = sc.nextInt();

			Product a = null;

			switch (choice) {
			case 1 -> {
				a = new Electronics(101,"Laptop",45000.0,"Lenovo");
				a.displayProductDetails();
				a.calculateDiscount();
			
			}
			case 2 -> {
				a = new Clothing(102,"Tones Shirt",1500.0,"Cotton");
				a.displayProductDetails();
				a.calculateDiscount();
				
			}

			case 3 -> {
				a = new Furniture(103,"Double Cart Bed",57000.0,"Ply-Wood");
				a.displayProductDetails();
				a.calculateDiscount();
			

			}
			case 4 -> {
				System.out.println("Sucessfuly exited!");
				sc.close();
				return;
			}
			default -> {
				System.out.println("Invalid selection or choice");
				sc.close();
				return;
			}

			}

		}

	}

}
