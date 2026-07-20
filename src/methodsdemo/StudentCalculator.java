/*
3.Take input from scanner class And display details
*/
package methodsdemo;
import java.util.Scanner;

public class StudentCalculator {
	
	void displayStudent(String name) {
		System.out.println("My Name is                          :"+name);
	}
	 void calculateTotal(int m1, int m2, int m3) {
		 int total=m1+m2+m3;
		 System.out.println("total value of the m1,m2&m3  :"+total);
		
	 }
	 void calculateAverage(int m1, int m2, int m3) {
		 float total=(m1+m2+m3)/3f;
		 System.out.println("total avg value of the m1,m2&m3    :"+total);
		 
	 }

	public static void main(String[] args) {
		StudentCalculator t=new StudentCalculator();
		System.out.println("Main Method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the student:");
		String name=sc.nextLine();
		
		System.out.println("enter the values of the m1,m2 &m3:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
				
		
		
		
		t.displayStudent(name);
		t.calculateTotal(m1,m2,m3);
		t.calculateAverage(m1,m2,m3);
		
		System.out.println("Main method ended");

	}

}
