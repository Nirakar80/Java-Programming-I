
public class Rectangle {
	
	private double length;
	private double width;
	
	public void setLength(double newLength)
	{
		length = newLength;
	}
	
	public void setWidth(double newWidth)
	{
		width = newWidth;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return length*width; 
	}
}
