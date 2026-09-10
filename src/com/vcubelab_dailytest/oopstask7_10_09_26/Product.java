package com.vcubelab_dailytest.oopstask7_10_09_26;

public class Product {

	int productId;
	String productName;
	double price;

	public Product() {

	}

	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	void displayProductDetails() {
		System.out.println("ProductId:" + productId);
		System.out.println("Product Name:" + productName);
		System.out.println("Price of the product:" + price);
	}

	void calculateDiscount() {

		double discount = (10 / 100.0) * price;
		System.out.println("dicount u got is:" + discount);
		System.out.println("The price you need to pay is after discount is :" + (price - discount));

	}

}
//Today's Assignment
//Java-
//1.Create a parent class Product with fields productId,
//productName, and price, 
//and a method displayProductDetails().
//Create child classes Electronics, Clothing, and 
//Furniture that extend Product.
//Add one additional field to each child class
//(brand, size, and material respectively).
//Override the method calculateDiscount() 
//in each child class to calculate different discount percentages.
//In the main() method, create objects of all 
//child classes and display the product details, discount, and final price