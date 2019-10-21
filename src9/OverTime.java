import java.util.Scanner;

public class OverTime {

	public static void main(String[] args) {
		
		double hours;
		double payRate;
		double multiplier;
		double grossPay;
		
		Scanner in = new Scanner(System.in);

		System.out.print("How many hours did you work? ");
		hours = in.nextDouble();
		
		System.out.print("How much is your hpurly pay rate? ");
		payRate = in.nextDouble();
		
		multiplier = hours <= 40 ? 1.0 : 1.5;
		
		grossPay = hours * payRate * multiplier;
		
		System.out.println("Your gross pay is $" +grossPay);
		
			
		
		
	}



}
