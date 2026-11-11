package Threads;

public class MovieTicketBookingSynchronization {

	public static void main(String[] args) {
		System.out.println("Main Method Started !");

		BookMyShow bm = new BookMyShow();

		Customer c1 = new Customer(bm, "Akash", 15);
		c1.start();

		Customer c2 = new Customer(bm, "Sura", 25);
		c2.start();

		Customer c3 = new Customer(bm, "Naveen", 30);
		c3.start();

		System.out.println("Main Method Ended !");

	}

}

class BookMyShow {

	int total_tickets = 50;

	synchronized void getTicket(int tickets, String name) {
		if (total_tickets >= tickets) {
			System.out.println(tickets + " " + "Tickets Booked Succesfully by " + name);
			total_tickets -= tickets;
			System.out.println("Remaining Tickets -> " + total_tickets);
		} else {
			System.out.println("Not enough tickets for " + name);
			System.out.println("Remaining Tickets -> " + total_tickets);

		}

	}

}

class Customer extends Thread {

	BookMyShow bs;
	int tickets;

	Customer(BookMyShow bs, String name, int tickets) {
		this.bs = bs;
		this.setName(name);
		this.tickets = tickets;
	}

	@Override
	public void run() {
		bs.getTicket(tickets, getName());

	}

}
