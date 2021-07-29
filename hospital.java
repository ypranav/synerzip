/*
 * 1. Exercise - (Hello world, Class, Object, Variables) Create as many different classes they can create from real world along with there properties. 
   Outcome - Should  be able to map real world objects to java classes along with proper data types for mapping the properties.
*/
package exercises;

import java.util.*;

public class hospital {
	
	public static void main(String[] args) {
		
		int enrollID, temp,bp;
		String name;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the patients enroll ID-");
		enrollID = sc.nextInt();		
		System.out.println("Enter the name of patient-");
		name = sc.next();		
		System.out.println("Enter the temperature of patient-");
		temp = sc.nextInt();		
		System.out.println("Enter the blood pressure of patient-");
		bp = sc.nextInt();			
		
		Patient P = new Patient(enrollID,name,temp,bp);
		
		P.displayfunc();
		
		sc.close();

	}

}

class Patient{	
	
	private int enrollID,temp,bp;
	private String name;	
		
	Patient(int enrollID, String name, int temp,int bp )
	{
		this.enrollID = enrollID;
		this.temp = temp;
		this.bp = bp;
		this.name = name;		
	}
	
	void displayfunc()
	{		
		System.out.println(" Patient brochure : \nEnrollment number: "+enrollID+ 
				"\nName: " +name+"\nTemperature: "+temp+"\nBlood Pressure: "+bp+" ");
		
	}
	
}
