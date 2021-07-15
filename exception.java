
public class exception {

	public static void main(String[] args) {
		try {
            int a = 20, b = 0;
            int c = a/b;  
            System.out.println ("The given result is " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }

	}

}
