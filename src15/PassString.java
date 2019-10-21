	
public class PassString 
{

	public static void main(String[] args) 
	{
		String name = "Shrestha";
		
		System.out.println("In main, name is "+ name);
		
		changename(name);
		
		System.out.println("Back in main, name is "+ name);
	}
	
	public static void changename(String str)
	{
		str = "Nirakar";
		
		System.out.println("In changename, name is "+ str );
	}
	

}
