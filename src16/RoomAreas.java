import java.util.Scanner;

public class RoomAreas {

	public static void main(String[] args) {
		
		double number;
		double totalArea;
		Scanner in = new Scanner(System.in);
		
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle den = new Rectangle();
		Rectangle bathroom = new Rectangle();
		
		
		System.out.print("Enter the length of the "
				+"kitchen: ");
		number = in.nextDouble();
		kitchen.setLength(number);
		
		System.out.print("Enter the width of the "
				+"kitchen: ");
		number = in.nextDouble();
		kitchen.setWidth(number);
		
		System.out.print("Enter the length of the"
				+" bedroom: ");
		number = in.nextDouble();
		bedroom.setLength(number);
		
		System.out.print("Enter the width of the"
				+" bedroom: ");
		number = in.nextDouble();
		bedroom.setWidth(number);
		
		System.out.print("Enter the length of the "
				+"den: ");
		number = in.nextDouble();
		den.setLength(number);
		
		System.out.print("Enter the width of the "
				+"den: ");
		number = in.nextDouble();
		den.setWidth(number);
		
		System.out.print("Enter the length of the "
				+"bathroom: ");
		number = in.nextDouble();
		bathroom.setLength(number);
		
		System.out.print("Enter the width of the "
				+"bathroom: ");
		number = in.nextDouble();
		bathroom.setWidth(number);

		totalArea = kitchen.getArea() + bedroom.getArea()
					+den.getArea()+bathroom.getArea();
		System.out.println("The total area"
				+ " of my appartment is "+totalArea);
		
		
	}

}
