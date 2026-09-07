package com.vcubelab_dailytest.oopstask4;

public class BurgerOrder extends Orderdetails implements Foodorder {
	
	@Override
	public void prepareFood() {
		System.out.println("Preparing Burger...");		
	}

	public static void main(String[] args) {
	

	}

}
//Today's Assignment
//
//Java-
//
//1.Create an interface FoodOrder with prepareFood(). 
//Create a base class OrderDetails with orderId, customerName, 
//price, and displayDetails(). 
//Create PizzaOrder and BurgerOrder 
//classes that extend OrderDetails and implement FoodOrder. 
//Override prepareFood() in both classes 
//and demonstrate runtime polymorphism in main().