//Java
//1.Task 5: Quiz Application (Tricky)
//Create a class Quiz.
//Constructors:
//Quiz()
//Quiz( subject)
//Quiz( subject,  totalQuestions)
//Quiz( subject,  totalQuestions,  timeLimit)
//Requirement:
//1.Every constructor must print a different message.
//2.Use this() to chain all constructors.
//3.Create only one object using the Noarg constructor and observe the execution order.
package constructors;
public class Quiz {
	String subject;
	double timeLimit;
	int totalQuestions;
	
	Quiz(){
		System.out.println("No arg Constructor is Called");
		this("Unknown");
	}
	Quiz(String subject){
		System.out.println("One R constructor is called");
		this(subject,0);
	}
	Quiz(String subject,int totalQuestion){
		System.out.println("Two R constructor is called");
		this(subject,totalQuestion,0.0);
	}
	Quiz(String subject,int totalQuestion,double timeLimit){
		System.out.println("Three R constructor is called");
		this.subject=subject;
		this.totalQuestions=totalQuestion;
		this.timeLimit=timeLimit;
	}


	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Quiz t= new Quiz();
		System.out.println("Main Method Ended");
		

	}

}
