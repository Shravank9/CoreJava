
package Threads;

public class OrderProcessingSystem {

    public static void main(String[] args) {

        Resource rm = new Resource();

        Producer p = new Producer(rm);
        Consumer c = new Consumer(rm);

        p.setName("Producer");
        c.setName("Consumer");

        p.start();
        c.start();
    }
}

class Resource {

    int i;

    void get() {
        System.out.println("Get -> " + i);
    }

    void put(int i) {
        this.i = i;
        System.out.println("Put -> " + i);
    }
}

class Producer extends Thread {

    Resource rm;

    Producer(Resource rm) {
        this.rm = rm;
    }

    @Override
    public void run() {

        int i = 0;

        while (true) {

            rm.put(i++);

            try {
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
