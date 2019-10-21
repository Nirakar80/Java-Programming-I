import javax.swing.JOptionPane;
public class Option {

	public final static String[] pizzas = {"Coke", "Pepsi","Sprite","Fanta","Dew"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String drink = (String) JOptionPane.showInputDialog(null , "Which drink do you want?", null, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
		
		System.out.print("You chose "+drink+".");
	}

}
