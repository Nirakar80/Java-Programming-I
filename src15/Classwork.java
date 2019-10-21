import javax.swing.JOptionPane;

public class Classwork
{

	public static void main(String[] args)
	{
		double length;
		double width;
		double area;
		
		//get the rectangle's length from the user
		length=getLength();
		
		//get the rectangle's width from the user
		width=getWidth();
		
		//get the rectangle's area
		area = getArea(length,width);
		
		//display the data of rectangle
		displayData(length,width,area);
		
	}
	
	public static double getLength()
	{
		String l= JOptionPane.showInputDialog("Enter the length of the rectangle: ");
		double length = Double.parseDouble(l);
		return length;
	}
	
	public static double getWidth()
	{
		String w= JOptionPane.showInputDialog("Enter the length of the rectangle: ");
		double width = Double.parseDouble(w);
		return width;
	}
	
	public static double getArea(double l, double w)
	{
		double area=l*w;
		return area;
	}
	
	public static void displayData(double length, double width, double area)
	{
		JOptionPane.showMessageDialog(null, "The rectangle with length "+ length+" and width "
				+ width + " has as area of "+ area);
	}
}
