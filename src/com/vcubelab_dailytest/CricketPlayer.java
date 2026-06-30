package com.vcubelab_dailytest;

public class CricketPlayer {
	static  String teamname;
	
	int runs;
	String playername;
	

	public static void main(String[] args) {
		 
		CricketPlayer t=new CricketPlayer();
		
		System.out.println("teamname:"+teamname);
		System.out.println("runs:"+t.runs);
        System.out.println("playername:"+t.playername);		
        System.out.println("---------------------------");
        
        
        CricketPlayer t1=new CricketPlayer();
        
        t1.runs=264;
        t1.playername="Rohit Gurunath Sharma";
        CricketPlayer.teamname="India";
        
        System.out.println("teamname:"+teamname);
		System.out.println("runs:"+t1.runs);
        System.out.println("playername:"+t1.playername);
        System.out.println("---------------------------");
        
        
        CricketPlayer t2=new CricketPlayer();
        t2.runs=84;
        t2.playername="virat kohli";

        System.out.println("teamname:"+teamname);
		System.out.println("runs:"+t2.runs);
        System.out.println("playername:"+t2.playername);
        System.out.println("---------------------------");
        
        
 //Showing that the static variable is shared by all objects,
 //while the instance variables store different values for each object.
		

	}

}
