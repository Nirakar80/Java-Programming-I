import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.*;
public class ShowFlowLayout {

	
	public static void main(String[] args) {
	
		JFrame frame = new JFrame("ShowFLowLayout");
		frame.setTitle("ShowFlowLayout");
		frame.setSize(200,200);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout( new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		Component firstname = frame.add( new JLabel("First Name"));
		frame.add( new JTextField(8));
		frame.add( new JLabel("Middle Initial"));
		frame.add( new JTextField(3));
		frame.add( new JLabel("Last Name"));
		frame.add( new JTextField(8));
		
		frame.setVisible(true);
		
		
		System.out.print(firstname);
	}

}
