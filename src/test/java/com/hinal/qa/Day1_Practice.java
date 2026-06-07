
package com.hinal.qa;

public class Day1_Practice  {

	
	public static void main(String[] args) {
		
        // 1. Variables & Data Types


        String name = "Hinal";
        int experience = 2;
        double rating  = 4.5;
        boolean qaprofessional = true;
        
        
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " Years");
        System.out.println("Dream Country: Germany");
        System.out.println("rating:" + rating);
        System.out.println("QA Professional:" + qaprofessional);
        
        // 2. If Else
       
        int age = 24;
        
        if (age >= 18 ) {
        	System.out.println("Eligible to work");
        }
        	else {
        		System.out.println("Not eligible");
        }
        
        // 3. For Loop

        System.out.println("Numbers from 1 to 20");
        
        for (int i = 1; i <= 20; i++){
        	
        
           System.out.println(i);
        }
        
        // 4. Even or Odd
        
        int number = 7 ;
        
        if (number % 2 == 0	) {
        	System.out.println(number + " is even");
        }else {
        	System.out.println(number + " is odd");
        }
        
        // 5. Array

        String [] browsers = {"Chrome", "Firefox", "Edge"};
        
        System.out.println("First brwoser:" + browsers[0]);
        System.out.println("Second brwoser:" + browsers[1]);
        System.out.println("Third brwoser:" + browsers[2]);

        
        // 6. String Functions
 
        String company  = "Germany QA Dream ";
        
        System.out.println("Length:" + company.length());
        System.out.println("Upper Case:" + company.toUpperCase());
        System.out.println("Contains QA:" + company.contains("QA"));
        
        System.out.println("Contains QA:" + company.contains("Developer"));
     
        
        // 7. Method Call


        printQAProfile();
        
    }
	     public static void printQAProfile() {
	    	 System.out.println("-----QA PROFILE----");
		     System.out.println("Name: Hinal Bhuva");
		     System.out.println();
		     System.out.println("Role: Software Quailty Assurance Professional");
		     System.out.println("Goal: QA Automation Job in germany");
		     System.out.println("Passionate: AI & Automation in testing");
		 
		
	}
	
	
	
}
