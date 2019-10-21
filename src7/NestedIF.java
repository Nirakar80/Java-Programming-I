import java.util.Scanner;
public class NestedIF {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter your Salary: $");
	double salary = in.nextDouble();
	
	if (salary >= 30000)
	{
		System.out.print("How many years have you been in the job? ");
		double years = in.nextDouble();
		
		if (years<2)
		{
			System.out.println("You have to be working atleast two years"
					+ " i=on your current job to qualify.");
		}
		else
		{
			System.out.print("Congratulations!! You qualify for the loan");
		}
	}
	else
	{
		System.out.println("You should have annual income of"
				+ " $30000 to qualify");
	}
	
	
	}

}
