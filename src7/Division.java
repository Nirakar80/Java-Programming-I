import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int a = in.nextInt();
		
		System.out.print("Enter an integer: ");
		int b = in.nextInt();
		
		if (b!=0)
		{
			 double q = a / (double) b;
			 System.out.print("The quotient is " +q);
		}
		else 
		{
			System.out.print("Division by zero is not possible");
		}
		

	}

}
