package com.vcubelab_dailytest.oopstask3_01_09_2026;

public class Main extends Shopping_Cart {

	public static void main(String[] args) {

		Main t = new Main();

		t.setCartitem(1);
		t.setTotalamount(45000);

		while (true) {

			System.out.println("Enter \n1)Add Item \n2)Remove Item \n3)Total Amount \n4)Exit");

			System.out.println("Enter the choice");

			int choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				System.out.println("Added Item:" + t.addItem());

			}

			case 2 -> {
				System.out.println("Total items:" + t.removeItem());
			}

			case 3 -> {

				System.out.println("Total amount:" + t.getTotal());

			}

			case 4 -> {
				System.out.println("Thank you for vist ,Please visit again");
				System.out.println("The Cartitem: " + t.getCartitem());
				System.out.println("THe Total Items:" + t.getTotalamount());
				return;
			}

			default -> {
				System.out.println("Invalid Option");
			}

			}
		}

	}

}

//Today's Assignment
//Java-
//1.Create a Java class named ShoppingCart using Encapsulation.
//Declare private variables cartItems and totalAmount.
//Implement addItem(), removeItem(), and getTotal() methods.
//Add and remove items by updating the cart details appropriately.
//In the main() method, display the total amount after performing the operations.
