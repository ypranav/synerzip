package exercises;
/*Exercise is to make them extensively play with all these concepts using real world objects and try all possible ways of implementing these concepts. 
Outcome - Should be able to clearly differentiate what are all these concepts and implement it.
*/
import java.util.ArrayList;
public class operations {
	 public static void main(String[] args) {
		    ArrayList<String> hospital = new ArrayList<>();

		    hospital.add("Patients");	// Addition of elements 
		    hospital.add("Doctors");
		    hospital.add("Nurses");
		    System.out.println("The Given ArrayList is: " + hospital);
		    
		    String[] arr = new String[hospital.size()];	//New String type array

		   
		    hospital.toArray(arr);	 // ArrayList to Array Conversion
		    System.out.print("Array of hospital elements is : ");
		   
		    for (String a : arr)	 //  Access elements of array
		    {
		      System.out.print(a + ", ");
		    }
		  }

}
