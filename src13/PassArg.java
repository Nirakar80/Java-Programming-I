
public class PassArg {

	public static void main(String[] args) 
	{
		int x =10;
		
		System.out.println("I am passing values to the displayValue method");
		displayValue(5);
		displayValue(x);
		displayValue(x*10);
		displayValue(Integer.parseInt( "700" ));
		System.out.println("Now I am back in the main method");
		
		
	}
	
	public static void displayValue(int num)
	{
		System.out.println("The value is "+ num);
	}
			

	}


