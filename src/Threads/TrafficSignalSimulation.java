package Threads;

public class TrafficSignalSimulation {

	public static void main(String[] args) {

		TrafficSignal t = new TrafficSignal();
		t.start();

	}

}

class TrafficSignal extends Thread {

	public void run() {

		try {

			while (true) {

				System.out.println("RED");
				Thread.sleep(5000);

				System.out.println("YELLOW");
				Thread.sleep(2000);

				System.out.println("GREEN");
				Thread.sleep(5000);

			}

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
//1.Create a Java program to simulate a traffic signal using multithreading.
//Display Red (5 sec), Yellow (2 sec), and Green (5 sec) 
//in sequence by using the Thread.sleep() method. Print each signal before pausing for its specified duration.