import java.awt.BorderLayout;

import javax.swing.*;
public class ShowBorderLayout {

	

	public static void main(String[] args) {

		JFrame box = new JFrame();
		box.setTitle("ShowBorderLayout");
		box.setSize(200, 320);
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		box.setLayout(new BorderLayout(200, 300));
				
		box.add( new JButton("East"), BorderLayout.EAST);
		box.add( new JButton("Center"), BorderLayout.CENTER);
		
		
		
		
		
		
		
		
		box.setVisible(true);
	}

}
