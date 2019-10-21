
public class Sale {

	public static void main(String[] args) {
		
		// Declare variables
		int cost;
		double rate;
		double tax;
		double total;
		double split;
		
		// Intialize vairables
		cost = 5;
		rate = 0.08;
		tax = cost * rate;
		total = cost + tax;
		split = total / 2;
		
		System.out.println("The tax is $" + tax);
		System.out.println("The total cost is $" + total);
		System.out.println("My half is $" + split);
		
		
		

	}

}
