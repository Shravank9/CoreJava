package methodsdemo;
import java.util.Scanner;

public class With_arugumentsnoreturntype {
	
	void studentName(String name) {
		System.out.println("Name of the student:"+name);
	}
	void studentAge(int age) {
		System.out.println("Age of the student:"+age);
	}
	void studentRollNo(int rollNo) {
		System.out.println("Roll Number of the student:"+rollNo);
	}
	void studentBranch(String branch) {
		System.out.println("Branch of the student:"+branch);
	}
	void studentSection(char section) {
		System.out.println("Section of student:"+section);
	}
	void studentCGPA(double cgpa) {
		System.out.println("CGPA of the student:"+cgpa);
	}
	void studentCollege(String college) {
		System.out.println("College of the studnet:"+college);
	}
	void studentEmail(String email) {
		System.out.println("Email Of the Student:"+email);
	}
	void studentPhone(long phone) {
		System.out.println("Phone number of the student:"+phone);
	}
	void studentAddress(String address) {
		System.out.println("Address of the student:"+address);
	}
	
	 void employeeName(String name){
		 System.out.println("Name of the employye is the:"+name);
	 }
	void employeeId(int id) {
		System.out.println("Id of the employee:"+id);
	}
	void employeeSalary(double salary) {
		System.out.println("Salary of the employee is:"+salary);
	}
	void employeeDepartment(String department) {
		System.out.println("Depart of the employee is:"+department);
	}
	void employeeDesignation(String designation) {
		System.out.println("designation of the employeer:"+designation);
	}
	void employeeExperience(int years) {
		System.out.println("years of the experience:"+years);
	}
	void employeeCompany(String company) {
		System.out.println("company of the employee:"+company);
	}
	void employeeLocation(String location) {
		System.out.println("location of employee:"+location);
	}
	void employeeEmail(String email) {
		System.out.println("email id of the employee:"+email);
	}
	void employeePhone(long phone) {
		System.out.println("Phone number of the employee:"+phone);
	}
	
	void accountNumber(long accountNo) {
		System.out.println("account number of customer:"+accountNo);
	}
	void accountHolder(String holderName) {
		System.out.println("Holder name of the customer:"+holderName);
	}
	void deposit(double amount) {
		System.out.println("amount to be deposit:"+amount);
	}
	void withdraw(double amount) {
		System.out.println("Amount need to be withdrwal:"+amount);
	}
	void transfer(double amount) {
		System.out.println("Amount need to be transfer:"+amount);
	}
	void checkBalance(double balance) {
		System.out.println("balance :"+balance);
	}
	void updatePin(int pin) {
		System.out.println("Updatedpin:"+pin);
	}
	void branchName(String branch) {
		System.out.println("Branch name of the bank:"+branch);
	}
	void accountType(String type) {
		System.out.println("Account type of customer is the:"+type);
	}
	void IFSCCode(String ifsc) {
		System.out.println("IFSC code of the bank: "+ifsc);
	}
	void productName(String product) {
		System.out.println("Name of the product:"+product);
	}
	void productId(int id) {
		System.out.println("Product id is the:"+id);
	}
	void productPrice(double price) {
		System.out.println("Price of the product:"+price);
	}
	void productQuantity(int quantity) {
		System.out.println("Qunatitu othe product:"+quantity);
	}
	void addToCart(String item) {
		System.out.println("item in cart is:"+item);
	}
	void removeFromCart(String item) {
		System.out.println("Removed the item from cart:"+item);
	}
	void applyCoupon(String coupon) {
		System.out.println("Apply the coupon on the cart:"+coupon);
	}
	void paymentMode(String mode) {
		System.out.println("Mode of the payment:"+mode);
	}
	void deliveryAddress(String address) {
		System.out.println("Address need to dleiver the item :"+address);
	}
	void orderStatus(String status) {
		System.out.println("Status of the product :"+status);
	}
	void login(String username) {
		System.out.println("enter your username while login:"+username);
	}
	void logout(String username) {
		System.out.println("enter your usernmae while loggout:"+username);
	}
	void search(String keyword) {
		System.out.println("search using keyword:"+keyword);
	}
	void uploadFile(String fileName) {
		System.out.println("Upload the file:"+fileName);
	}
	void downloadFile(String fileName) {
		System.out.println("Sucessfully the downloaded the file:"+fileName);
	}
	void sendMessage(String message) {
		System.out.println("send message:"+message);
	}
	void receiveMessage(String sender) {
		System.out.println("Received message from the sneder:"+sender);
	}
	void calculateArea(double radius) {
		System.out.println("Radius of the circle:"+radius*radius*Math.PI);
	}
	void convertTemperature(double celsius) {
		System.out.println("Celsius of temparture:"+celsius);
		
	}
	void displayResult(boolean passed) {
		System.out.println("Passed or Failed:"+passed);
	}
	
	void admitPatient(String patientName) {
		System.out.println("Name of patient:"+patientName);
	}
	void dischargePatient(String patientName) {
		System.out.println("Name of  discharge patient:"+patientName);
	}
	void doctorName(String doctor) {
		System.out.println("Name of the doctor:"+doctor);
	}
	void bookAppointment(String doctor) {
		System.out.println("book Appointment for doctor :"+doctor);
	}
	void prescribeMedicine(String medicine) {
		System.out.println("prescribed medicine by doctor:"+medicine);
	}
	void patientAge(int age) {
		System.out.println("age oge patient:"+age);
	}
	void patientWeight(double weight) {
		System.out.println("weight of the patient:"+weight);
	}
	void patientBloodGroup(String bloodGroup) {
		System.out.println("Blood group of patient:"+bloodGroup);
	}
	void generateBill(double amount) {
		System.out.println("amount need to pay:"+amount);
	}
	void roomNumber(int roomNo) {
		System.out.println("Room number of the patient:"+roomNo);
	}
	
	
	public void issueBook(String bookName) {
	    System.out.println("Book Issued: " + bookName);
	}

	public void returnBook(String bookName) {
	    System.out.println("Book Returned: " + bookName);
	}

	public void reserveBook(String bookName) {
	    System.out.println("Book Reserved: " + bookName);
	}

	public void searchBook(String title) {
	    System.out.println("Searching Book: " + title);
	}

	public void fineAmount(double fine) {
	    System.out.println("Fine Amount: ₹" + fine);
	}

	public void memberName(String member) {
	    System.out.println("Member Name: " + member);
	}

	public void libraryCard(long cardNo) {
	    System.out.println("Library Card Number: " + cardNo);
	}

	public void authorName(String author) {
	    System.out.println("Author Name: " + author);
	}

	public void publisherName(String publisher) {
	    System.out.println("Publisher Name: " + publisher);
	}

	public void bookCategory(String category) {
	    System.out.println("Book Category: " + category);
	}
	public void insertCard(String cardNumber) {
	    System.out.println("Card Number: " + cardNumber);
	}

	public void enterPin(int pin) {
	    System.out.println("PIN Entered: " + pin);
	}

	public void withdrawCash(double amount) {
	    System.out.println("Withdraw Amount: ₹" + amount);
	}

	public void depositCash(double amount) {
	    System.out.println("Deposit Amount: ₹" + amount);
	}

	public void transferMoney(double amount) {
	    System.out.println("Transfer Amount: ₹" + amount);
	}

	public void miniStatement(String accountNo) {
	    System.out.println("Mini Statement for Account: " + accountNo);
	}

	public void checkATMStatus(String status) {
	    System.out.println("ATM Status: " + status);
	}

	public void changePin(int newPin) {
	    System.out.println("New PIN: " + newPin);
	}

	public void accountHolderName(String name) {
	    System.out.println("Account Holder Name: " + name);
	}

	public void accountBalance(double balance) {
	    System.out.println("Account Balance: ₹" + balance);
	}
	
	private void courseName(String course) {
	    System.out.println("Course Name: " + course);
	}

	private void semester(int sem) {
	    System.out.println("Semester: " + sem);
	}

	private void section(char sec) {
	    System.out.println("Section: " + sec);
	}

	private void subjectName(String subject) {
	    System.out.println("Subject Name: " + subject);
	}

	private void facultyName(String faculty) {
	    System.out.println("Faculty Name: " + faculty);
	}

	private void attendance(double percentage) {
	    System.out.println("Attendance: " + percentage + "%");
	}

	private void internalMarks(int marks) {
	    System.out.println("Internal Marks: " + marks);
	}

	private void externalMarks(int marks) {
	    System.out.println("External Marks: " + marks);
	}

	private void hallTicket(String hallTicketNo) {
	    System.out.println("Hall Ticket No: " + hallTicketNo);
	}

	private void resultStatus(boolean status) {
	    System.out.println("Result Status: " + status);
	}

	 void main(String[] args) {
		System.out.println("Main Method Started");
		  System.out.println("______________________________________________________________________");

		Scanner sc=new Scanner(System.in);
		
studentName("sura");
	 studentAge(21);
	 studentRollNo(23);
 studentBranch("CSM");
 studentSection('A');
 studentCGPA(9.0);
 studentCollege("VNR College");
 studentEmail("Sura@gamil.com");
 studentPhone(+917675786543L);
 studentAddress("Kompally");
  System.out.println("______________________________________________________________________");
 employeeName("Varshith");
 employeeId(101);
 employeeSalary(351000);
  employeeDepartment("Technical Support Desk ");
 employeeDesignation("Software asscioate engineer");
 employeeExperience(5);
 employeeCompany("TCS");
 employeeLocation("Hyderabad");
 employeeEmail("varshith@gamil.com");
 employeePhone(+917879767543L);
  System.out.println("______________________________________________________________________");
 
 accountNumber(76757535437L);
 accountHolder("Varshith Reddy Golamari Venkata Naga Sai");
  deposit(50000);
 withdraw(23000);
  transfer(6400);
  checkBalance(20600);
  updatePin(4546);
  branchName("KPHP");
  accountType("Savings account");
  IFSCCode("@#4Alo89200j38yL");
  System.out.println("______________________________________________________________________");

  
  productName("Laptop");
   productId(12205);
   productPrice(50660);
   productQuantity(3);
  addToCart("AC");
   removeFromCart("Washing Machine");
   applyCoupon("ACE345890");
   paymentMode("UPI");
   deliveryAddress("KPHP");
   orderStatus("Accepted");
  System.out.println("______________________________________________________________________");
  
  login("Sura55");
  logout("Sura55");
   search("Age");
   uploadFile("Suraresume");
   downloadFile("RAG basics");
   sendMessage("Hi, how r u?");
   receiveMessage("hey hi iam fine ,what about u?");
   calculateArea(3.5);
   convertTemperature(35.5);
   displayResult(true);
	  System.out.println("______________________________________________________________________");
	  
	  
	  admitPatient("John Doe");
	  dischargePatient("John Doe");
	  doctorName("Dr. Smith");
	  bookAppointment("Dr. Smith");
	  prescribeMedicine("Paracetamol");
	  patientAge(30);
	  patientWeight(72.5);
	  patientBloodGroup("O+");
	  generateBill(1500.75);
	  roomNumber(205);
	  System.out.println("______________________________________________________________________");
	  
	  issueBook("The Alchemist");
	  returnBook("The Alchemist");
	  reserveBook("Atomic Habits");
	  searchBook("Clean Code");
	  fineAmount(150.50);
	  memberName("Rahul Sharma");
	  libraryCard(9876543210L);
	  authorName("Robert C. Martin");
	  publisherName("Pearson");
	  bookCategory("Programming");
	  
	  System.out.println("______________________________________________________________________");

	  insertCard("1234-5678-9012-3456");
	  enterPin(1234);
	  withdrawCash(5000.00);
	  depositCash(2500.50);
	  transferMoney(1500.75);
	  miniStatement("SBIN123456789");
	  checkATMStatus("Active");
	  changePin(4321);
	  accountHolderName("Rahul Sharma");
	  accountBalance(45000.80);
	  System.out.println("______________________________________________________________________");
	  
	  courseName("Computer Science");
	  semester(5);
	  section('A');
	  subjectName("Java Programming");
	  facultyName("Dr. Ramesh");
	  attendance(92.5);
	  internalMarks(28);
	  externalMarks(65);
	  hallTicket("HT202600123");
	  resultStatus(true);

	  System.out.println("______________________________________________________________________");
	

System.out.println("Main Method ended");

	}

}
