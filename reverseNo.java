import java.util.Scanner;
public class reverseNo {

	public static void main(String args[]) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the no to be reversed");
		int N = a.nextInt();
				
		String s= "";
		
		while( N != 0)
		{
			int last= N % 10;
			s = s + Integer.toString(last);
			N = N / 10;	
		}
		System.out.print(s);
		a.close();
	}
}
