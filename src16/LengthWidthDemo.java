
public class LengthWidthDemo {

	public static void main(String[] args) {
		
		//Create a rectangle object and assign to the box variable
		Rectangle box = new Rectangle();
		
		System.out.println("Setting the value 10.0"
				+ " to the setLength method");
		box.setLength(10.0);
		
		System.out.println("Setting the value 7.0"
				+ " to the setWidth method");
		box.setWidth(7.0);
		
		System.out.println("The Box's length is "
		+box.getLength());
		
		System.out.println("The Box's width is "
		+ box.getWidth());
		
		System.out.println("The area of the box "
		+"is "+ box.getArea());
	}

}
