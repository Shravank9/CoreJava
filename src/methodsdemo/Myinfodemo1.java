
package methodsdemo;
import java.util.Scanner;
public class Myinfodemo1 {
	
	void calculateTotal(int m1, int m2, int m3) {
		int total=m1+m2+m3;
		System.out.println("total of sum:"+total);
		
	}
	void calculateAverage(int m1, int m2, int m3) {
		float avg=(m1+m2+m3)/3.0f;
		System.out.println("total of avg:"+avg);
	}

	
	
	public static void main(String[] args) {
		Myinfodemo1 t=new Myinfodemo1();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Main method started");
		
		/*
		 * int m1=sc.nextInt(); int m2=sc.nextInt(); int m3=sc.nextInt();
		 * t.calculateAverage(m1, m2, m3); t.calculateTotal(m1, m2, m3);
		 */
		
		
		  t.calculateTotal(sc.nextInt(),sc.nextInt(),sc.nextInt());
		  t.calculateAverage(sc.nextInt(),sc.nextInt(),sc.nextInt());
		 
		System.out.println("Main method ended");

	}

}
