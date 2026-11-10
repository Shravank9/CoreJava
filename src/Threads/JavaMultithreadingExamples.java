package Threads;

public class JavaMultithreadingExamples implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("Thread 4");
		for (int i = 30; i < 40; i++) {
			System.out.println(Thread.currentThread().getName() + "-> " + i);
		}
	}

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		JavaMultithreadingExamples t = new JavaMultithreadingExamples();
		Thread t1 = new Thread(t);

		thread2 t3 = new thread2();
		thread3 t4 = new thread3();
		thread1 t2 = new thread1(t3, t4);

		t1.setName("Daemon Thread");
		t1.setDaemon(true);

		t1.start();

		t2.start();
		t3.start();
		t4.start();

		System.out.println("Is Daemon: " + t1.isDaemon());

		System.out.println("Main Method Ended");

	}

}

class thread1 extends Thread {
	thread2 t2;
	thread3 t3;

	thread1(thread2 t2, thread3 t3) {
		this.t2 = t2;
		this.t3 = t3;

	}

	@Override
	public void run() {
		Thread.currentThread().setName("Thread 1");

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				try {
					t2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				try {
					t3.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println(Thread.currentThread().getName() + "-> " + i);

//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}

class thread2 extends Thread {

	@Override
	public void run() {
		Thread.currentThread().setName("Thread 2");
		Thread.currentThread().setPriority(MAX_PRIORITY);
		for (int i = 10; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + " -> " + i + " | Priority: "
					+ Thread.currentThread().getPriority());

		}
	}
}

class thread3 extends Thread {

	@Override
	public void run() {
		Thread.currentThread().setName("Thread 3");
		for (int i = 20; i < 30; i++) {
			System.out.println(Thread.currentThread().getName() + "-> " + i);
//			Thread.yield();
		}
	}
}