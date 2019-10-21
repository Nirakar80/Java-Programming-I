import javax.swing.JOptionPane;
public class Area {

	public static void main(String[] args) {
		
	String radius = JOptionPane.showInputDialog(null, "Enter radius: ");
	

	double r = Double.parseDouble(radius);
	double A = Math.PI*r*r;
	
	System.out.println("The area of the circle is "+ A + ".");
	
	}

}
