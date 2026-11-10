package Threads;

public class EvenOddThreadDemo extends Thread {

    @Override
    public void run() {

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(
                Thread.currentThread().getName() + " -> " + i
            );
        }
    }

    public static void main(String[] args) {

        Thread.currentThread().setName("Odd Thread");

        System.out.println("Main Method Started");

        EvenOddThreadDemo t = new EvenOddThreadDemo();

        t.setName("Even Thread");
        t.start();

        // Odd numbers execute in Main Thread
        for (int i = 1; i <= 19; i += 2) {
            System.out.println(
                Thread.currentThread().getName() + " -> " + i
            );
        }

        System.out.println("Main Method Ended");
    }
}