import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		int num;
		double result;
		int repeat;
		Scanner in = new Scanner(System.in);
		
		System.out.println("This program displays the "
				+ "square root of a number");
		
		do
		{
			System.out.print("Enter a number: ");
			num = in.nextInt();
			
			result = Math.sqrt(num);
			
			System.out.println("The square root of " + num + " is "
					+ result);
			System.out.println("Would you like to calculate "
					+ "another square root? ");
			System.out.println("Enter 1 for Yes or 0 for no: ");
			repeat = in.nextInt();
			
		}while (repeat==1);
			
	}

}

