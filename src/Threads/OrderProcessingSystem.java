
package Threads;

public class OrderProcessingSystem {

	public static void main(String[] args) {

		Resource rm = new Resource();

		Producer p = new Producer(rm);
		Consumer c = new Consumer(rm);

	}
}

class Resource {

	int i;
	boolean status = false;

	synchronized void get() {

		while (status) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get -> " + i);
		status = true;
		notify();

	}

	synchronized void put(int i) throws InterruptedException {
		this.i = i;
		while (!status) {
			wait();

		}
		System.out.println("Put -> " + i);
		status = false;
		notify();
	}
}

class Producer extends Thread {

	Resource rm;

	Producer(Resource rm) {
		this.rm = rm;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {

		int i = 0;

		while (true) {


			try {
				rm.put(i++);

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

class Consumer extends Thread {

	Resource rm;

	Consumer(Resource rm) {
		this.rm = rm;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {

		while (true) {

			rm.get();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}
