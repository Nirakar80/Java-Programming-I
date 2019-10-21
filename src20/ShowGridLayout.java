import java.awt.GridLayout;

import javax.swing.*;

public class ShowGridLayout {

	public static void main(String[] args) {
		
		 JFrame box = new JFrame();
		 
		 box.setTitle("ShowGridLayout");
		 box.setSize( 200,120);
		 box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 box.setLayout( new GridLayout(3, 2, 5, 5));
		 
		 box.add( new JLabel("First Name"));
		 box.add( new JTextField(8));
		 box.add( new JLabel("Middle Initial"));
		 box.add( new JTextField(3));
		 box.add( new JLabel("Last Name"));
		 box.add( new JTextField(8));
		 
		 box.setVisible(true);
	}

}
