import java.util.Scanner;

public class CheckTemperature {

	public static void main(String[] args) {
		
		double t;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the temperature: ");
		t = in.nextDouble();
		
		while (t>100)
		{
			System.out.println("The temperature is too high.");
			System.out.print("Enter the temperature again: ");
			t = in.nextDouble();
		}
		
		System.out.println("The temperature is in acceptable zone" );
	}

}
