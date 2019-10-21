import java.util.Scanner;

public class SearchArray {

	private static Scanner in;

	public static void main(String[] args) {
	
		int[] tests = { 87, 75, 98, 100, 82};
		int results;
		
		System.out.println("Enter the marks you want to search");
		in = new Scanner(System.in);
		int USER_IN = in.nextInt();
		
		results = sequentialSearch(tests, USER_IN);		
		if(results == -1)
		{
			System.out.println("You didnot earn 100 on any test");
		}
		else
		{
			System.out.println("You earned 100 on test "+ results);
		}
	}
	
	public static int sequentialSearch(int[] array, int value)

	{
		int element;
		
		element =-1;
		
		for ( int index =0; index < array.length; index++)
		{
			if(array[index] == value)
			{
				element=index;
				break;
			}
		}
		return element;
		
	}
}
