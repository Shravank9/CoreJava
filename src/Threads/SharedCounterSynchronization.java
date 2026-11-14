package Threads;

public class SharedCounterSynchronization {

	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();

		MyThread t = new MyThread(c);
		MyThread t1 = new MyThread(c);

		t.start();
		t1.start();
		
		t.join();
		t1.join();
		
		System.out.println("FinalCount: "+c.count);

	}

}

class Counter {

	int count = 0;

	synchronized void increment() {
		count++;
	}

}

class MyThread extends Thread {

	Counter c;

	MyThread(Counter c) {
		this.c = c;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 1000; i++) {
			c.increment();
		}
	}
}
//Today's Assignment 
//
//Java-
//1.Create 2 threads accessing a shared counter.
//Each thread increments the counter 1000 times.
//Final output must be 2000.
//
//2.Create 2 threads using wait() and notify().
//Thread 1 prints odd numbers.
//Thread 2 prints even numbers.
//Output must be 1 to 20 sequentially.
//
//Servlets-
//1.Develop a web application using Java Servlets, JDBC, HTML, CSS, and MySQL. 
//The application should implement complete CRUD operations with user-friendly navigation.