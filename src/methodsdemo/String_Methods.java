
package methodsdemo;

public class String_Methods {

 void main(String[] args) {
          System.out.println("Main Method Started");
          printGreeting();
          showclg();
          showCity("KNR");    
          showCountry("India");
          showEmail();
          System.out.println("Main Method Ended");
	}
	void showName() {
		String name="Karthik";
		System.out.println("My Name is:"+name);
	}
	void showclg() {
		
		String name="CMR";
		System.out.println("My Clg is:"+name);
	}
	void showCity(String city)
	{
	
	System.out.println("My city is the:"+city);
	}
	void showCountry(String name) {
		System.out.println("My country is:"+name);
		
	}
	void showEmail() {
		String email="sura@gmail.com";
		System.out.println("My emai id is the:"+email);
		
	}
	void printMessage() {
		System.out.println("How are u?");
		
	}
	void printGreeting() {
		System.out.println("Hello Mrng!");
		printWelcome();
		printMessage();		
		showName();
	}
	void printWelcome() {
		System.out.println("Welcome to my  office");

	}
	void printJava()
{
		System.out.println("iam learning jav in vcube");
}
	
}
