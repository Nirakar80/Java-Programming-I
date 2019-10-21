
public class Discount {

	public static void main(String[] args) {

		double price;
		double discount;
	
		// regular/original price
		price = 29.0;
		System.out.println(price);
			
		// price after up-raise 
		price = price + 10;
		System.out.println(price);
		
		// 20% discount
		discount = 0.2* price;
		
		// final price
		price = price - discount;
		System.out.println(price);

	}

}
