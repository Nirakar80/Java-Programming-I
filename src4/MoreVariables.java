public class MoreVariables {

	public static void main(String[] args) {
		
		// variable declaration
		float price;
		double tax;
		double total;
		
		// variable initialization
		price = 29.5F;
		tax = 1.76;
		 total = price + tax;
		
		System.out.println("The price of the item is $" + price);
		System.out.println("The tax is $"+ tax);
		System.out.println("The total price of the item is $" + (price+tax));
		System.out.println("The total price of the item is $"+ total);
		
		if (
		 	total > 40 )
		 	System.out.println("The price is more than $40");
		 	
		 else
		 		System.out.println("The price is less than $40"); 
		 	
				
	}

}
