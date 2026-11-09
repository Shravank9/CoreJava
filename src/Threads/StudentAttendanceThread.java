package Threads;


public class StudentAttendanceThread extends Thread {

	public static void main(String[] args) {
		StudentAttendanceThread t = new StudentAttendanceThread();
		System.out.println("Main method Started");
		t.start();
		t.run();

		int n = 10;
		while (n > 0) {
			System.out.println("From Main n ->:" + " " + n);
			n--;

		}
		System.out.println("Main Method ended");

	}

	@Override
	public void run() {
		System.out.println("Run method Started");
		int i = 10;
		while (i > 0) {
			System.out.println("From Run i ->:" + " " + i);
			i--;

		}
		System.out.println("Run Method ended");
	}

}
