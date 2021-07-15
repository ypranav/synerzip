import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a number : ");				
				int N = sc.nextInt();
				if(N >= 0)
				{
					
					int fac = 1;
					for(int i = N ; i >= 1 ; i--)
					fac = fac * i;
					
					System.out.println("Factorial of "+N+" is "+fac);
					
				}
				else
					System.out.println(" Re-enter the value");
				sc.close();													
			}

	}


