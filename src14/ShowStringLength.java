
public class ShowStringLength 
{

	public static void main(String[] args)
	{
		String name = "Warren";
		showLength(name);
	}
	
	public static void showLength(String a)
	{
		int x =a.length();
		System.out.println(a+ " is "+x+" characterrs.");
	}
}
