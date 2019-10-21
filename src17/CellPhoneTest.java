import java.util.Scanner;

public class CellPhoneTest
{

	public static void main(String[] args) 
	{
		
		String testMfr;
		String testModel;
		double testPrice;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the Manufaturer: ");
		testMfr = in.nextLine();
		
		System.out.print("Enter the model: ");
		testModel = in.nextLine();
		
		System.out.print("Enter the price: ");
		testPrice = in.nextDouble();
		
		
		CellPhone myPhone = new CellPhone(testMfr, testModel, testPrice);		
		
		System.out.println();
		System.out.println("Manufacturer: "+ myPhone.getManufacturer());
		System.out.println("Model: "+ myPhone.getModel());
		System.out.println("Price: $"+ myPhone.getPrice());
		

	}

}
