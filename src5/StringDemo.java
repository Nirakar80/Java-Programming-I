import javax.swing.JOptionPane;
public class StringDemo {

	public static void main(String[] args) {
		
	String a;
	String n;
	int ss;
	
	a = "Good Morning ";
	n = JOptionPane.showInputDialog(null,"What's your name?"); 
	ss = n.length();
	
	
	n = n.substring(0,1).toUpperCase()+ n.substring(1);
	char l =  n.charAt(2);
				
	System.out.println(a +" "+ n);
	System.out.println("The length of the charachter is "+ ss);
	System.out.println("The third letter of your name is " +l);
	}

}
