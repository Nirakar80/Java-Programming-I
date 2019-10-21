import java.util.Scanner;
public class TestScore {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your Score: ");
		int testScore = in.nextInt();
		
		if (testScore < 60)
		{
			System.out.println("Your grade is F.");
		}
		else if(testScore < 70)
		{
			System.out.println("Your garde is D");
		}
		else if(testScore < 80)
		{
			System.out.println("Your garde is c");
		}
		else if(testScore < 90)
		{
			System.out.println("Your garde is B");
		}
		else if (testScore <= 100) 
		{
			System.out.println("Your garde is A");
		}
		else
		{
			System.out.println("Invalid Score.");
		}
		
	}

}
