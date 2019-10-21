import javax.swing.JOptionPane;

public class TotalSales {

	public static void main(String[] args) {
	
		
		double totalSales;
		String input;
		double in =0;
		
		totalSales = 0.0;
		
		for (int count=1;count <=7;count++)
		{
			input = JOptionPane.showInputDialog("Enter the sale for"
					+ " day "+count+": ");
			in = Double.parseDouble(input);
			totalSales += in;
						
		}
		JOptionPane.showMessageDialog(null, "The total sales are $"+totalSales);
	}

}
