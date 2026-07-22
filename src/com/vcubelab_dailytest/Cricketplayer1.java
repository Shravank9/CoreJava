/*Java Assignment – Argument Constructor

Create a method to calculate and display the average runs per match using the formula:
Average Runs = Total Runs / Matches Played
Read the values using the Scanner class, create an object by passing the values to the constructor, and display all the player details along with the average runs.

Sample Input:
Enter Player Name: Virat Kohli
Enter Matches Played: 100
Enter Total Runs: 5000

Expected Output:
Player Name      : Virat Kohli
Matches Played   : 100
Total Runs       : 5000
Average Runs     : 50.0*/


package com.vcubelab_dailytest;
import java.util.Scanner;

public class Cricketplayer1 {
	
	String Name;
	int Matches_played;
	int runs;
	
	Cricketplayer1(String Name,int Matches_played,int runs){
		//System.out.println("Parameterized constructor is called");
		this.Name=Name;
		this.Matches_played=Matches_played;
		this.runs=runs;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the player Name:");
		String a=sc.nextLine();
		
		System.out.println("Enter Matches Played:");
		int b=sc.nextInt();
		
		System.out.println("Enter Total Runs:");
		int c=sc.nextInt();
		
		Cricketplayer1 t= new Cricketplayer1(a,b,c);
		t.display();
		double y=t.calculate();
		
		System.out.println("Average Runs     :"+y);
		
		
		System.out.println("Main Method Ended");

	}
	double calculate() {
		double  avg=runs/Matches_played;
		return avg;
		
	}
	
	void display() {
		System.out.println("Player Name      :"+Name);
		System.out.println("Matches Played   :"+Matches_played);
		System.out.println("Total Runs       :"+runs);
	}

}
