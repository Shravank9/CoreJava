package com.vcubelab_dailytest.oopstask4;

public class Main {

	public static void main(String[] args) {

		Foodorder f;

		f = new PizzaOrder();
		f.prepareFood();

		Orderdetails p = new PizzaOrder();
		p.displayDetails();

		System.out.println("-----------------------------");

		f = new BurgerOrder();
		f.prepareFood();

		Orderdetails b = new BurgerOrder();
		b.displayDetails();
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