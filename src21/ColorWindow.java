import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ColorWindow extends JFrame
{	
	private JLabel messageLabel;
	private JButton redButton;
	private JButton blueButton;
	private JButton yellowButton;
	private JButton resetButton;
	private JPanel panel;
	private final int W_W = 220;
	private final int W_H = 120;
	
	public ColorWindow()
	{
	setTitle("Colors");
	setSize(W_W, W_H);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	messageLabel = new JLabel("Click a button to select a color.");
	redButton = new JButton("Red");
	redButton.setBackground(Color.red);
	redButton.setToolTipText("This is red button.");
	redButton.addActionListener(new RedButtonListener());
	blueButton = new JButton("Blue");
	blueButton.setBackground(Color.blue);
	blueButton.setToolTipText("This is blue button.");
	blueButton.addActionListener(new BlueButtonListener());
	yellowButton = new JButton("Yellow");
	yellowButton.setBackground(Color.yellow);
	yellowButton.setToolTipText("This is yellow button.");
	yellowButton.addActionListener(new YellowButtonListener());
	resetButton = new JButton("Reset");
	resetButton.setToolTipText("This is reset button.");
	resetButton.addActionListener(new ResetButtonListener());
	
	panel = new JPanel();
	panel.add(messageLabel);
	panel.add(redButton);
	panel.add(blueButton);
	panel.add(yellowButton);
	panel.add(resetButton);
	
	add(panel);
	setVisible(true);
	
	}
	
	private class RedButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			panel.setBackground(Color.red);
			messageLabel.setForeground(Color.white);
		}
		
	}
	
	private class BlueButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			panel.setBackground(Color.blue);
			messageLabel.setForeground(Color.white);
		}
		
	}
	
	private class YellowButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			panel.setBackground(Color.yellow);
			messageLabel.setForeground(Color.black);
		}
		
	}
	
	private class ResetButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			panel.setBackground(Color.white);
			messageLabel.setForeground(Color.black);
		}
		
	}
	public static void main(String[] args)
	{
		new ColorWindow();
		
		
	}

}
