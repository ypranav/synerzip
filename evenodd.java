import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the value of x:");
		int x = sc.nextInt();
		
		if(x%2==0)
			System.out.println(x+" is an even no");
		else
			System.out.println(x+" is an odd no");
		
		sc.close();
	}
}
