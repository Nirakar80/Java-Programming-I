import javax.swing.JOptionPane;

public class CupConverter 
{

	public static void main(String[] args) 
	{
		double cups, ounces;
		cups = getCups();
		ounces = cupsToOunces(cups);
		
		displayResluts(cups,ounces);
	}
	
	

	public static double getCups()
	{
		String input;
		double numCups;
		
		input = JOptionPane.showInputDialog("Enter the number of cups.");
		numCups = Double.parseDouble(input);
		return numCups;
	}
	
	public static double cupsToOunces(double numCups) 
	{
		return numCups * 8.0;
	}

	public static void displayResluts(double cups, double ounces) 
	{
		JOptionPane.showMessageDialog(null, cups +" cups equals "+ ounces + " fluid ounces.");
	}
		
		
	
}
