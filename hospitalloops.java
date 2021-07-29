package exercises;

import java.util.*;

public class hospitalloops{

	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);	
	
	int sel=0;
	while(true)
	{
		System.out.println("\n1.Check the temperature of Patient  \n 2.Check the BP of Patient \n"
				+ "Enter any other no to exit");
		System.out.println("\nEnter your choice ");
		sel = s.nextInt();
		
		switch(sel) {
		
		case 1:	System.out.println("Enter the temperature-");
				int temp= s.nextInt();	
				
			if(temp>=90)
				System.out.println("Critical Condition");
			else if(temp>=80 && temp<90)
				System.out.println("Mild Condition");
			else if(temp>=70 && temp<80)
				System.out.println("Normal Condition");
			break;
		
		case 2:	System.out.println("Enter the blood pressure-");
				int bp = s.nextInt();
				
			if(bp>=140)
			System.out.println("High Blood Pressure");
			else if(bp>=90 && bp<120)
				System.out.println("Normal Blood Pressure");
			else if(bp>=40 && bp<90)
				System.out.println("Low Blood Pressure");
			break;
	
		default: System.exit(0);
		
		}
		
	}

   }	
	
	
}


