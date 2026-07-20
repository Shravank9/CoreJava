/*void add(int a, int b)
void subtract(int a, int b)
void multiply(int a, int b)
void divide(int a, int b)
void modulus(int a, int b)
void square(int n)
void cube(int n)
void power(int a, int b)*/


package methodsdemo;
import java.util.Scanner;
import java.lang.Math;

public class Marksmethod {
	
	void add(int a, int b) {
		int total=a+b;
		System.out.println("addition of a and b:"+total);
	}
	void subtract(int a, int b) {
		int total=(a-b);
		System.out.println("subtraction of a and b:"+total);
		
	}
	void multiply(int a, int b) {
		int total=(a*b);
		System.out.println("Multiplication  of a and b:"+total);
		
	}
	void divide(int a, int b) {
		int total=(a/b);
		System.out.println("quotient  of a and b:"+total);
	}
	void modulus(int a, int b) {
		int total=(a%b);
		System.out.println("remainder  of a and b:"+total);
	}
	void square(int n)
	{		
		System.out.println("area of square is:"+Math.pow(n,2));
	}
	
	void cube(int n)
	{		
		System.out.println("area of cube is:"+Math.pow(n,3));
	}
	
	void power(int a, int b) {
		int pow=(int)Math.pow(a, b);
		double result = Math.pow(a, b);
		System.out.println("power of the given number is the:"+pow);
		System.out.println("power of the given number is the:"+result);
	}

	
	public static void main(String[] args) {
		Marksmethod t=new Marksmethod();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Main Method started");
		
		t.add(sc.nextInt(),sc.nextInt());
		t.subtract(sc.nextInt(),sc.nextInt());
		t.multiply(sc.nextInt(),sc.nextInt());
		t.divide(sc.nextInt(),sc.nextInt());
		t.modulus(sc.nextInt(),sc.nextInt());
		t.square(sc.nextInt());
		t.cube(sc.nextInt());
		t.power(sc.nextInt(),sc.nextInt());
		

		
		System.out.println("Main method ended");

	}

}
