package com.vcubelab_dailytest.oopstask7_10_09_26;

public class Furniture extends Product {

	String material;

	
	public Furniture(int productId, String productName, double price,String material) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.material=material;
	}
	
	
	

	@Override
	void displayProductDetails() {
		super.displayProductDetails();
		System.out.println("The materail used in Furniture is:" + material);
	}

	@Override
	void calculateDiscount() {

		double discount = (25 / 100.0) * price;
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
