import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class FileWriteDemo {

	public static void main(String[] args) throws FileNotFoundException {
	
		String filename;
		String friendname;
		String numFriends;
		int n;
		
		numFriends= JOptionPane.showInputDialog("How many friends do you have?" );		
		n= Integer.parseInt(numFriends);
		
		filename= JOptionPane.showInputDialog("Enter the file name: " );
		
		PrintWriter outputFile = new PrintWriter(filename);
		
		
		for (int i =1;i<=n;i++)
		{
			friendname = JOptionPane.showInputDialog("Enter the name of friend #"+i+": ");
			
			outputFile.println(friendname);
		}
		
		outputFile.close();
	}

}
