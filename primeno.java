import java.util.Scanner;
public class primeno {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int x = sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			if(x%i==0)
				count++;			
		}
		
		if(count>2)
			System.out.println(x+" is not prime no");
		else
			System.out.println(x+" is a prime no");
		
		sc.close();

	}

}
