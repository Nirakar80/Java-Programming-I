import java.util.Scanner;

public class ClassWork 
{

	public static void main(String[] args) 
	{
	
		int years, months, days;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Find number of days in");
		System.out.println("(Y) for years or (M) for months or (B) for mixed: ");
		String option = in.nextLine();
		
		if 		(option.equalsIgnoreCase("y")) 
		{
			System.out.print("Enter the number of years: ");
			years = in.nextInt();
			days = daysInYear(years);
			System.out.print("The number of days in "+years+" years is "+days);
		}	
		
		else if  (option.equalsIgnoreCase("m"))
		{
			System.out.print("Enter the number of months: ");
			months = in.nextInt();
			days=daysInMonths(months);
			System.out.print("The number of days in "+months+" mponths is "+days);
		}
		
		else if  (option.equalsIgnoreCase("b"))
		{
			System.out.print("Enter the number of years: ");
			years = in.nextInt();
			System.out.print("Enter the number of months: ");
			months = in.nextInt();
			days=daysInMixed(years,months);
			System.out.print("The number of days in "+years+" years and "+months+" months is "+days);
		}
	}
	
	private static int daysInMixed(int years, int months) {

		int s = (years*365) + (months*30);
		return s;
	}

	private static int daysInMonths(int months) 
	{
		int s = months*30;
		return s;
	}

	public static int daysInYear(int years)
	{
		int s = years*365;
		return s;
	}
	
	
	
			
	


}
