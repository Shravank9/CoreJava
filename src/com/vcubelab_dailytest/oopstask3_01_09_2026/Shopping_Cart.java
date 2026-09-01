package com.vcubelab_dailytest.oopstask3_01_09_2026;

import java.util.Scanner;

public class Shopping_Cart {

	static Scanner sc = new Scanner(System.in);

	private int cartitem;
	private double totalamount;

	public int getCartitem() {
		return cartitem;
	}

	public void setCartitem(int cartitem) {
		this.cartitem = cartitem;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}

	public int addItem() {

		System.out.println("Added item added Sucessfully");
		return cartitem = getCartitem() + 1;

	}

	public int removeItem() {

		if (getCartitem() > 0) {

			System.out.println("One Item Was removed Sucessfully ");
			return cartitem = getCartitem() - 1;
		}
		System.out.println("Item cannot be removed because it was alraedy has zero item quantity!");
		return 0;
	}

	public double getTotal() {

		return totalamount = getCartitem() * getTotalamount();
	}

}
//Today's Assignment
//Java-
//1.Create a Java class named ShoppingCart using Encapsulation.
//Declare private variables cartItems and totalAmount.
//Implement addItem(), removeItem(), and getTotal() methods.
//Add and remove items by updating the cart details appropriately.
//In the main() method, display the total amount after performing the operations.
