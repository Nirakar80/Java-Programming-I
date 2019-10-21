
public class ValueReturn 
{

	public static void main(String[] args) 
	{
	
		int value1 =10;
		int value2 =20;
		int total;
		
		total = sum(value1, value2);
		System.out.println("The sum of " + value1 +" and "
				+value2+" is "+ total );
	}
	
	public static int sum(int num1, int num2)
	{
		int result = num1 + num2;
		return (result);
		
	}

}
