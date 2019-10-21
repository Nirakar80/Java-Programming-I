import javax.swing.JOptionPane;

public class Sales {

	public static void main(String[] args) {
		
		final int ONE_WEEK =7;
		double [] sales = new double[ONE_WEEK];
		
		
		for( int index = 0; index < sales.length ; index++)
		{
			String s = JOptionPane.showInputDialog("Enter the sale"
					+ " of day " + (index+1));
			sales[index] = Double.parseDouble(s);
		}
		
		SalesData week = new SalesData(sales);
		
		JOptionPane.showMessageDialog(null, "The sum of the sales was: $"+ week.getTotal());
		JOptionPane.showMessageDialog(null, "The average sales was: $"+ week.getAverage());
		JOptionPane.showMessageDialog(null, "The highest sale was: $"+ week.getHighest());
		JOptionPane.showMessageDialog(null, "The lowest sale was: $" + week.getLowest());
			}

}
