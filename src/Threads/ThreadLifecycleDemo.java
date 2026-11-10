
package Threads;

public class ThreadLifecycleDemo extends Thread {

	@Override
	public void run() {

		Thread.currentThread().setName("Child Thread");

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String[] args) {

		Thread.currentThread().setName("Main Thread");

		System.out.println("Main method Started");

		ThreadLifecycleDemo t = new ThreadLifecycleDemo();

		t.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}

		System.out.println("Main method Ended");
		t.start();
	}
}
//Java-
//1.Create a class named TestThread extending Thread.
//Override the run() method.
//Create one object.
//Call start() two times on the same object.
//Observe the output.
//Identify the exception generated.
//Explain why the same thread object cannot be started twice.
//2.Create two threads:
//Thread 1 prints even numbers from 2 to 20.
//Thread 2 prints odd numbers from 1 to 19.
//
//Servlets-
//1.Develop a web application using Java Servlets, JDBC, HTML, CSS, and MySQL. 
//The application should implement complete CRUD operations with user-friendly navigation.
