package Threads;

public class FoodDeliveryWaitNotifyDemo {

	public static void main(String[] args) {

		System.out.println("Main Method Started");

		Food f = new Food();
		Customers c = new Customers(f);
		Delivery d = new Delivery(f);

		System.out.println("Main Method Ended");

	}

}

class Customers extends Thread {
	Food f;

	Customers(Food f) {
		this.f = f;
		Thread t = new Thread(this, "Customers");
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			f.get();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Delivery extends Thread {

	Food f;

	Delivery(Food f) {
		this.f = f;
		Thread t = new Thread(this, "Delivery");
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			f.put();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Food {

	boolean result = false;

	synchronized void get() {
		while (!result) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Customer is waiting for the food...");
		result = false;
		notify();
	}

	synchronized void put() {
		while (result) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Delivery person has delivered the food.");
		result = true;
		notify();

	}

}
//Today's Assignment 
//
//Java-
//1.Create a Java program with two threads: a Customer thread that waits for food using wait(), and a 
//Delivery thread that delivers the food and calls notify().
//Display appropriate messages before waiting, after delivery, and after the customer receives the food.