package com.vcubelab_dailytest.oopstask4;

public class Orderdetails   {

	private int orderId=12345;
	private String customerName="Sura";
	private double price=500.00;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public Orderdetails() { 
		
	}
	
	
	
	public Orderdetails(int orderId, String customerName, double price) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.price = price;
	}



	void displayDetails() {

		System.out.println("OrderID:" + orderId);
		System.out.println("Customer Name:" + customerName);
		System.out.println("Price:" + price);

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
