

package com.vcubelab_dailytest;

public class Mobile_recharge {

	
 void main(String[] args) {
	 System.out.println("Main Method Started");
	 showPlandetails();
	 recharge(299);
	 System.out.println("Main Method Ended");

	}
	void showPlandetails() {
		System.out.println("Current Recharge Plan");
		String Plan_Name="Unlimited 299";
	    int	Validity=28;
	    float Data=1.5f;
	    System.out.println("Output For No Arguments");
	    String calls="Unlimited";
	    System.out.println("Plan Name     :"+Plan_Name);
	    System.out.println("Validity      :"+Validity+" "+"Days");
	    System.out.println("Data          :"+Data+" "+"GB/Day");
	    System.out.println("Calls         :"+calls);
	    System.out.println("--------------------------------------------");

		
	}
	void recharge(double amount) {
		 System.out.println("Output For  Arguments");
		System.out.println("Recharge Successful!");
		System.out.println("Recharge Amount:"+amount);
		
	}

}
