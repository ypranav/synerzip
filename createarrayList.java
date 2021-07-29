package exercises;
/*Excercise - (JAVA API like arraylist, import) is to use arraylist and explore various methods available and use those in boolean expressions like isEmpty, size etc.
   Outcome - Should learn to use and find existing API's available in Java. Should be able to read and understand API docs.*/
import java.util.ArrayList;

class createarrayList {
	
  public static void main(String[] args){
    
    ArrayList<String> hospital = new ArrayList<>();	// create ArrayList

 
    hospital.add("Patients");	// Addition of elements 
    hospital.add("Doctors");
    hospital.add("Nurses");
    System.out.println("The Given ArrayList is: " + hospital);
    
    
 
    String str = hospital.get(2);	// Access Elements
    System.out.println("\nIndex 2 element is : " + str);
  

  
    hospital.set(2, "Medical");		  // Modify Elements
    System.out.println("\n Modified ArrayList is : " + hospital);
    
 
    String str1 = hospital.remove(1);	// delete element from index 1
    System.out.println("\nThe Updated ArrayList should be : " + hospital);
    System.out.println("\nThe Removed Element is: " + str1);
  }
}