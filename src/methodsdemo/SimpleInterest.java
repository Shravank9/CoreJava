
package methodsdemo;
import java.util.Scanner;
public class SimpleInterest {
	 static Scanner sc=new Scanner(System.in);
	
	double calculateInterest(double principal, double rate, int time) {
		return (principal*rate*time)/100;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		SimpleInterest t=new SimpleInterest();
		System.out.println("enter value of principal:");
		double a=sc.nextDouble();
		System.out.println("enter value of rate:");
		double b=sc.nextDouble();
		System.out.println("enter value of time:");
		int c=sc.nextInt();
		double d=t.calculateInterest(a, b, c);
		System.out.println("Interes of simple is the :"+d);
		System.out.println("Main Method Ended");
		

	}

}
