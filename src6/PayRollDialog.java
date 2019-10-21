import javax.swing.JOptionPane;
public class PayRollDialog {

	public static void main(String[] args) {
	
		String n= JOptionPane.showInputDialog("What's your name?");
		String name = n.substring(0, 1).toUpperCase() +n.substring(1);
		
		String h = JOptionPane.showInputDialog("How many hour's did you work?");
		int hours = Integer.parseInt(h);
		
		String r = JOptionPane.showInputDialog("What's your pay rate?");
		double rate = Double.parseDouble(r);
		
		Double grossPay = hours* rate;
		
		JOptionPane.showMessageDialog(null,"Hello! "+name+". "+"Your total pay is $"+grossPay+".");
		
		}

}
