import java.util.Scanner;
public class CreditCard {

	public static void main(String[] args) {
		
		double salary;
		int CR;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your Salary: ");
		salary = in.nextDouble();

		System.out.print("Enter your credit reating: ");
		CR = in.nextInt();
		if (salary>2000 && CR >=7)
			qualify();
		else
			noQualify();
		
	}

	private static void qualify() 
		{
			System.out.println("Congratulations!! You qualify for a credit card");
		}
		
	private static void noQualify() 
		{
			System.out.println("Sorry, you do not qyalify for the credit card.");
		}
	
	}

