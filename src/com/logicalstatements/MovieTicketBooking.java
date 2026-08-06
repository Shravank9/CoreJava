package com.logicalstatements;

import java.util.Scanner;

public class MovieTicketBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s="";
		
		
		do {
		System.out.println("==================================");
		System.out.println("Welcome To Sura Presents !");
		System.out.println("==================================");
		System.out.println("1 Telugu");
		System.out.println("2 Hindi");
		System.out.println("3 English");
		System.out.println("4 Tamil");

		String movieName = "";
		String languageName = "";
		String theatreloc = "";
		String theatreName = "";
		String screenName = "";
		String showTime = "";
		String seatType = "";
		double seatPrice = 0.0;
		double totalbill = 0.0;
		String paymentMode = "";
		

		System.out.println("==================================");
		System.out.println("choose a language:");
		int languageChoice = sc.nextInt();

		switch (languageChoice)

		{

		case 1 -> {

			System.out.println("1 Kingdom");
			System.out.println("2 OG");
			System.out.println("3 Akhanda 2");
			System.out.println("4 Pushpa 2");
			System.out.println("==================================");
			System.out.println("Choose a movie:");
			int movieChoice = sc.nextInt();

			switch (movieChoice) {
			case 1 -> {

				System.out.println("Kingdom");
				System.out.println("IMDB:7.5");
				System.out.println("Rating:4.3");
				System.out.println("150k+ Likes");
				movieName = "Kingdom";

			}
			case 2 -> {
				System.out.println("OG");
				System.out.println("IMDB:7.9");
				System.out.println("Rating:3.9");
				System.out.println("100k+ Likes");
				movieName = "OG";

			}
			case 3 -> {
				System.out.println("Akhanda 2");
				System.out.println("IMDB:8.0");
				System.out.println("Rating:2.9");
				System.out.println("110k+ Likes");
				movieName = "Akhanda 2";
			}
			case 4 -> {
				System.out.println("Pushpa 2");
				System.out.println("IMDB:8.5");
				System.out.println("Rating:4.2");
				System.out.println("850k+ Likes");
				movieName = "Pushpa 2";

			}
			default -> {
				System.out.println("Invalid Options");
				sc.close();
				return;
			}

			}
			languageName = "Telugu";

		}
		case 2 -> {

			System.out.println("1 War 2");
			System.out.println("2 Jawan ");
			System.out.println("3 Animal ");
			System.out.println("4 Brahmastra ");
			System.out.println("Choose a movie:");
			int movieChoice = sc.nextInt();

			switch (movieChoice) {
			case 1 -> {
				System.out.println("War 2");
				System.out.println("IMDB:6.5");
				System.out.println("Rating:3.3");
				System.out.println("120k+ Likes");
				movieName = "War 2";

			}
			case 2 -> {
				System.out.println("Jawan");
				System.out.println("IMDB:7.9");
				System.out.println("Rating:3.7");
				System.out.println("5000k+ Likes");
				movieName = "Jawan";

			}
			case 3 -> {
				System.out.println("Animal ");
				System.out.println("IMDB:7.5");
				System.out.println("Rating:4.5");
				System.out.println("650k+ Likes");
				movieName = "Animal";
			}
			case 4 -> {
				System.out.println("Brahmastra ");
				System.out.println("IMDB:8.3");
				System.out.println("Rating:4.2");
				System.out.println("350k+ Likes");
				movieName = "Brahmastra";

			}
			default -> {
				System.out.println("Invalid Options");
				sc.close();
				return;
			}
			}
			languageName = "Hindi";
		}

		case 3 -> {
			System.out.println("1 Avatar");
			System.out.println("2 Avengers");
			System.out.println("3 Jurassic World ");
			System.out.println("4 Superman ");
			System.out.println("select a movie:");
			int movieChoice = sc.nextInt();

			switch (movieChoice) {
			case 1 -> {
				System.out.println("Avatar ");
				System.out.println("IMDB:7.5");
				System.out.println("Rating:3.3");
				System.out.println("120L+ Likes");
				movieName = "Avatar";

			}
			case 2 -> {
				System.out.println("Avengers");
				System.out.println("IMDB:8.9");
				System.out.println("Rating:3.7");
				System.out.println("5000L+ Likes");
				movieName = "Avengers";

			}
			case 3 -> {
				System.out.println("Jurassic World ");
				System.out.println("IMDB:7.5");
				System.out.println("Rating:4.5");
				System.out.println("650L+ Likes");
				movieName = "Jurassic World";
			}
			case 4 -> {
				System.out.println("Superman ");
				System.out.println("IMDB:8.3");
				System.out.println("Rating:4.2");
				System.out.println("350L+ Likes");
				movieName = "Superman";

			}
			default -> {
				System.out.println("Invalid Options");
				sc.close();
				return;
			}
			}
			languageName = "English";
		}

		case 4 -> {
			System.out.println("1 Leo");
			System.out.println("2 Vikram");
			System.out.println("3 Kaithi ");
			System.out.println("4 Jailer  ");
			System.out.println("select a movie:");
			int movieChoice = sc.nextInt();

			switch (movieChoice) {
			case 1 -> {
				System.out.println("Leo");
				System.out.println("IMDB:7.5");
				System.out.println("Rating:3.9");
				System.out.println("120k+ Likes");
				movieName = "Leo";

			}
			case 2 -> {
				System.out.println("Vikram");
				System.out.println("IMDB:7.9");
				System.out.println("Rating:4.2");
				System.out.println("5000k+ Likes");
				movieName = "Vikram";

			}
			case 3 -> {
				System.out.println("kaithi ");
				System.out.println("IMDB:7.5");
				System.out.println("Rating:4.5");
				System.out.println("650k+ Likes");
				movieName = "Kaithi";
			}
			case 4 -> {
				System.out.println("Jailer ");
				System.out.println("IMDB:7.4");
				System.out.println("Rating:3.6");
				System.out.println("350k+ Likes");
				movieName = "Jailer";

			}
			default -> {
				System.out.println("Invalid Options");
				sc.close();
				return;
			}

			}
			
		}

		}

		System.out.println("==================================");
		System.out.println("Choose a Theatre:");
		System.out.println("1 PVR");
		System.out.println("2 INOX");
		System.out.println("3 Cinepolis");
		System.out.println("4 Asian");

		
		int theatreChoice = sc.nextInt();

		switch (theatreChoice) {
		case 1 -> {
			System.out.println("Choose PVR Locations");
			System.out.println("==================================");
			System.out.println("1 PVR Nexus Mall - Kukatpally");
			System.out.println("2 PVR Next Galleria Mall - Punjagutta");
			System.out.println("3 PVR Central Mall - Panjagutta");
			System.out.println("4 PVR Central Mall - Panjagutta");
			theatreName = "PVR";
			System.out.println("Choose Location:");
			int locationChoice = sc.nextInt();

			switch (locationChoice) {
			case 1 -> {
				theatreloc = " PVR Nexus Mall - Kukatpally";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("3 Screen 3 (IMAX)");
				System.out.println("4 Screen 4 (Dolby Atmos)");
				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}
				case 3 -> {
					screenName = "Screen 3 (IMAX)";

				}
				case 4 -> {
					screenName = "Screen 4 (Dolby Atmos)";
				}
				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}

			}
			case 2 -> {
				theatreloc = "PVR Next Galleria Mall - Punjagutta";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("3 Screen 3 (3D)");
				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();
				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}
				case 3 -> {
					screenName = "Screen 3 (3D)";

				}

				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}
			}
			case 3 -> {
				theatreloc = "PVR Central Mall - Panjagutta";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();
				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}

				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}
				}
			}
			case 4 -> {
				theatreloc = "PVR Central Mall - Panjagutta";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();
				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}

				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}
				}

			}
			default -> {
				System.out.println(" Invalid Location  Of PVR");
				sc.close();
				return;

			}

			}

		}
		case 2 -> {
			System.out.println("Choose INOX Locations");
			System.out.println("==================================");
			System.out.println("1 INOX GSM Mall - Miyapur");
			System.out.println("2 INOX Ashoka One Mall - Kukatpally");
			System.out.println("3 INOX GVK One Mall - Banjara Hills");
			System.out.println("4 INOX Maheshwari Parmeshwari Mall - Kachiguda");
			theatreName = "INOX";
			System.out.println("Choose Location:");
			int locationChoice = sc.nextInt();

			switch (locationChoice) {
			case 1 -> {
				theatreloc = " INOX GSM Mall - Miyapur";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("3 Screen 3 (IMAX)");
				System.out.println("4 Screen 4 (Dolby Atmos)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}
				case 3 -> {
					screenName = "Screen 3 (IMAX)";

				}
				case 4 -> {
					screenName = "Screen 4 (Dolby Atmos)";
				}
				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}

			}
			case 2 -> {
				theatreloc = "INOX Ashoka One Mall - Kukatpally";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("3 Screen 3 (IMAX)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}
				case 3 -> {
					screenName = "Screen 3 (IMAX)";

				}

				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}
			}
			case 3 -> {
				theatreloc = "INOX GVK One Mall - Banjara Hills";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}

				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}
			}
			case 4 -> {
				theatreloc = "INOX Maheshwari Parmeshwari Mall - Kachiguda";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (Dolby Atmos)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}

				case 2 -> {
					screenName = "Screen 2 (Dolby Atmos)";
				}
				default -> {
					System.out.println("Invalid Screen Selected");
				}

				}
			}
			default -> {
				System.out.println(" Invalid Location Of INOX");
				sc.close();
				return;
			}

			}

		}

		case 3 -> {
			System.out.println("Choose Cinepolis Locations");
			System.out.println("==================================");
			System.out.println("1 Cinepolis Manjeera Mall - JNTU");
			System.out.println("2 Cinepolis DSL Virtue Mall - Uppal");
			System.out.println("3 Cinepolis CCPL Mall - Malkajgiri");
			System.out.println("4 Cinepolis Sarath City Capital Mall - Kondapur");

			theatreName = "Cinepolis";
			System.out.println("Choose Location:");
			int locationChoice = sc.nextInt();

			switch (locationChoice) {
			case 1 -> {
				theatreloc = "Cinepolis Manjeera Mall - JNTU";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("3 Screen 3 (IMAX)");
				System.out.println("4 Screen 4 (Dolby Atmos)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}
				case 3 -> {
					screenName = "Screen 3 (IMAX)";

				}
				case 4 -> {
					screenName = "Screen 4 (Dolby Atmos)";
				}
				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}
			}
			case 2 -> {
				theatreloc = "Cinepolis DSL Virtue Mall - Uppal";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("3 Screen 3 (IMAX)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}
				case 3 -> {
					screenName = "Screen 3 (IMAX)";

				}

				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}

			}
			case 3 -> {
				theatreloc = "Cinepolis CCPL Mall - Malkajgiri";

				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("3 Screen 3 (3D)");
				System.out.println("4 Screen 4 (Dolby Atmos)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}
				case 3 -> {
					screenName = "Screen 3 (3D)";

				}
				case 4 -> {
					screenName = "Screen 4 (Dolby Atmos)";
				}
				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}

			}
			case 4 -> {
				theatreloc = "Cinepolis Sarath City Capital Mall - Kondapur";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}

				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}
			}
			default -> {
				System.out.println(" Invalid Location Of Cinepolis ");
				sc.close();
				return;
			}

			}
		}
		case 4 -> {
			System.out.println("Choose Asian Locations");
			System.out.println("==================================");
			System.out.println("1 Asian Cine Square - Uppal");
			System.out.println("2 Asian Lakshmikala - Moosapet");
			System.out.println("3 Asian M Cube Mall - Attapur");
			System.out.println("4 Asian Shiva Ganga - Dilsukhnagar");

			theatreName = "Asian";
			System.out.println("Choose Location:");
			int locationChoice = sc.nextInt();

			switch (locationChoice) {
			case 1 -> {
				theatreloc = "Asian Cine Square - Uppal";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("3 Screen 3 (IMAX)");
				System.out.println("4 Screen 4 (Dolby Atmos)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}
				case 3 -> {
					screenName = "Screen 3 (IMAX)";

				}
				case 4 -> {
					screenName = "Screen 4 (Dolby Atmos)";
				}
				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}
			}
			case 4 -> {
				theatreloc = "Asian Shiva Ganga - Dilsukhnagar";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("3 Screen 3 (IMAX)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}
				case 3 -> {
					screenName = "Screen 3 (IMAX)";

				}

				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}
			}
			case 2 -> {
				theatreloc = "Asian Lakshmikala - Moosapet";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}

				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}
			}
			case 3 -> {
				theatreloc = "Asian M Cube Mall - Attapur";
				System.out.println("==================================");
				System.out.println("Available Screens");
				System.out.println("==================================");
				System.out.println("1 Screen 1 (2D)");
				System.out.println("2 Screen 2 (3D)");
				System.out.println("3 Screen 3 (IMAX)");
				System.out.println("4 Screen 4 (Dolby Atmos)");

				System.out.println("Choose a Screen:");
				int screenChoice = sc.nextInt();

				switch (screenChoice) {
				case 1 -> {
					screenName = "Screen 1 (2D)";

				}
				case 2 -> {
					screenName = "Screen 2 (3D)";
				}
				case 3 -> {
					screenName = "Screen 3 (IMAX)";

				}
				case 4 -> {
					screenName = "Screen 4 (Dolby Atmos)";
				}
				default -> {
					System.out.println("Invalid Screen Selected");
					sc.close();
					return;
				}

				}
			}
			default -> {
				System.out.println(" Invalid Location Of Asian ");
				sc.close();
				return;

			}

			}
		}
		default -> {
			System.out.println("Invalid Location");
			sc.close();
			return;
		}

		}

		System.out.println("==================================");
		System.out.println("Available Show Timings");
		System.out.println("==================================");
		System.out.println("1 Morning Show (10:00 AM)");
		System.out.println("2 Matinee Show (1:30 PM)");
		System.out.println("3 First Show (6:30 PM)");
		System.out.println("4 Second Show (10:00 PM)");
		System.out.println("Choose Show Time:");
		int timeChoice = sc.nextInt();

		switch (timeChoice) {
		case 1 -> {
			showTime = "Morning Show (10:00 AM)";
			System.out.println("==================================");
			System.out.println("Seat Categories");
			System.out.println("==================================");
			System.out.println("1 Silver - ₹150");
			System.out.println("2 Gold - ₹220");
			System.out.println("3 Platinum - ₹350");

			System.out.println("Choose Seat Type:");
			int seatChoice = sc.nextInt();

			switch (seatChoice) {

			case 1 -> {
				seatType = "Silver - ₹150";
				seatPrice = 150;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);
			}
			case 2 -> {
				seatType = "Gold - ₹220";
				seatPrice = 220;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);
			}
			case 3 -> {
				seatType = "Platinum - ₹350";
				seatPrice = 350;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);
			}
			default -> {
				System.out.println("Grand Total:" + 0);
				sc.close();
				return;
			}

			}
		}
		case 2 -> {

			showTime = "Matinee Show (1:30 PM)";
			System.out.println("==================================");
			System.out.println("Seat Categories");
			System.out.println("==================================");
			System.out.println("1 Silver - ₹150");
			System.out.println("2 Gold - ₹220");
			System.out.println("3 Platinum - ₹350");

			System.out.println("Choose Seat Type:");
			int seatChoice = sc.nextInt();

			switch (seatChoice) {

			case 1 -> {
				seatType = "Silver - ₹150";
				seatPrice = 150;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);

			}
			case 2 -> {
				seatType = "Gold - ₹220";
				seatPrice = 220;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);

			}
			case 3 -> {
				seatType = "Platinum - ₹350";
				seatPrice = 350;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);
			}
			default -> {
				System.out.println("Grand Total:" + 0);
				sc.close();
				return;
			}

			}

		}
		case 3 -> {
			showTime = "First Show (6:30 PM)";
			System.out.println("==================================");
			System.out.println("Seat Categories");
			System.out.println("==================================");
			System.out.println("1 Silver - ₹150");
			System.out.println("2 Gold - ₹220");
			System.out.println("3 Platinum - ₹350");

			System.out.println("Choose Seat Type:");
			int seatChoice = sc.nextInt();

			switch (seatChoice) {

			case 1 -> {
				seatType = "Silver - ₹150";
				seatPrice = 150;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);
			}
			case 2 -> {
				seatType = "Gold - ₹220";
				seatPrice = 220;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);

			}
			case 3 -> {
				seatType = "Platinum - ₹350";
				seatPrice = 350;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);
			}
			default -> {
				System.out.println("Grand Total:" + 0);
				sc.close();
				return;
			}

			}
		}
		case 4 -> {
			showTime = "Second Show (10:00 PM)";
			System.out.println("==================================");
			System.out.println("Seat Categories");
			System.out.println("==================================");
			System.out.println("1 Silver - ₹150");
			System.out.println("2 Gold - ₹220");
			System.out.println("3 Platinum - ₹350");

			System.out.println("Choose Seat Type:");
			int seatChoice = sc.nextInt();

			switch (seatChoice) {

			case 1 -> {
				seatType = "Silver - ₹150";
				seatPrice = 150;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);

			}
			case 2 -> {
				seatType = "Gold - ₹220";
				seatPrice = 220;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);

			}
			case 3 -> {
				seatType = "Platinum - ₹350";
				seatPrice = 350;
				System.out.println("Enter Number of Tickets:");
				int tickets = sc.nextInt();
				String GST = "12%";
				totalbill = ((tickets * seatPrice * 0.12) + (tickets * seatPrice));

				System.out.println("==================================");
				System.out.println("Ticket Amount :" + tickets * seatPrice);
				System.out.println("GST :" + GST);
				System.out.println("Grand Total :" + totalbill);
			}
			default -> {
				System.out.println("Grand Total:" + 0);
				sc.close();
				return;
			}

			}
		}
		default -> {
			System.out.println("Invalid time Zone Selected");
			sc.close();
			return;
		}

		}

		if (totalbill > 0) {

			System.out.println("==================================");
			System.out.println("Payment");
			System.out.println("==================================");
			System.out.println("1 Cash");
			System.out.println("2 Card");
			System.out.println("3 UPI");
			System.out.println("Choose Payment:");
			int paymentChoice = sc.nextInt();

			switch (paymentChoice) {
			case 1 -> {
				paymentMode = "Cash";

			}
			case 2 -> {
				paymentMode = "Card";

			}
			case 3 -> {
				paymentMode = "UPI";
			}
			default -> {
				System.out.println("Invalid Options Selected");
				sc.close();
				return;
			}

			}
			System.out.println("Payment Mode :" + paymentMode);
			
		}
		
		System.out.println("Do You Want Continue (Y/N)?");
		s=sc.next();
	}while(s.equalsIgnoreCase("y"));
	sc.close();
		

	}

}
