import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonListener implements ActionListener
{

	@Override
	
	public void actionPerformed(ActionEvent event) 
	{
		
		String actionCommand = event.getActionCommand();
		
		if(actionCommand.equals("Button1"))
		{
			JOptionPane.showMessageDialog(null, "You clicked Button 1");
		}
		else if(actionCommand.equals("Button2"))
		{
			JOptionPane.showMessageDialog(null, "You clicked Button 2");
		}
		else if(actionCommand.equals("Button3"))
		{
			JOptionPane.showMessageDialog(null, "You clicked Button 3");
		}
	}
	
	
		






}
