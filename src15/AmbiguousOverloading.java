
public class AmbiguousOverloading 
{
	public static void main(String[] args)
	{
		System.out.println("The max number between 2 and 4 is "+ max(2,4) );
		
		System.out.println("The max number between 4 and 2.9 is "+ max (2.9,4) );
	}
	
	public static double max(int num1, double num2)
	{
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	public static double max(double num1, int num2)
	{
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

}
