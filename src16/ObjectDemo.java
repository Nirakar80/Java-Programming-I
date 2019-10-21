import java.util.Random;
import java.util.Scanner;

public class ObjectDemo {

	public static void main(String[] args) {
		
		int maxNumbers;
		int number;
		
		Scanner in = new Scanner(System.in);
		
		Random rand = new Random();
		
		System.out.print("How many random numbers should I display?");
		maxNumbers = in.nextInt();
		
		for (int i=1; i<=maxNumbers; i++)
		{
			number = rand.nextInt(1000);
			System.out.printf("%7d",number);
			if (i%10 == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Done");
	}

}
