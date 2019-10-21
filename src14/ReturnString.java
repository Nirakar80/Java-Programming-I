
public class ReturnString
{

	public static void main(String[] args) 
	{
		String customerName;
		customerName = fullNameUpperCase("John","Martin");
		System.out.println("Hello "+ customerName);
		

	}

	private static String fullNameUpperCase(String first, String last) 
	{
		String result = first.toUpperCase()+" "+last.toUpperCase();
		return result;
	}

}
