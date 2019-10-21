import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Notepad {
	
	private JFrame frame;
	private JTextArea textArea;
	private JPanel fontPanel;
	private JRadioButton dialogFontButton;
	private JRadioButton monospacedFontButton;
	private JRadioButton serifFontButton;
	private JRadioButton none;
	private ButtonGroup fontNameGroup;
	
	public Notepad()
	{
		frame = new JFrame("Frame Window");
		frame.setSize(325, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		textArea = new JTextArea(10, 25);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		fontPanel = new JPanel();
		fontPanel.setBorder(BorderFactory.createTitledBorder("Font Name"));
		dialogFontButton = new JRadioButton("Dialog", false);
		dialogFontButton.addActionListener(new dialogFontListener());
		monospacedFontButton = new JRadioButton("Mono-spaced", false);
		monospacedFontButton.addActionListener(new monospacedFontListener());
		serifFontButton = new JRadioButton("Serif", false);
		serifFontButton.addActionListener(new dialogFontListener());
		none = new JRadioButton("None", true);
	
		
		fontNameGroup = new ButtonGroup();
		fontNameGroup.add(dialogFontButton);
		fontNameGroup.add(monospacedFontButton);
		fontNameGroup.add(serifFontButton);
		fontNameGroup.add(none);
		
		fontPanel.add(dialogFontButton);
		fontPanel.add(monospacedFontButton);
		fontPanel.add(serifFontButton);
		fontPanel.add(none);
		
		frame.add(textArea);
		frame.add(fontPanel);
		frame.setVisible(true);
	}
	
	private class dialogFontListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			Font font = new Font(Font.DIALOG, Font.PLAIN, 12);
			textArea.setFont(font);
			
		}
	}

	private class monospacedFontListener implements ActionListener
	{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Font font = new Font(Font.MONOSPACED, Font.PLAIN, 12);
				textArea.setFont(font);
				
			}
	}
			

	private class serifFontListener implements ActionListener
	{

				@Override
				public void actionPerformed(ActionEvent e)
				{
					Font font = new Font(Font.SERIF, Font.PLAIN, 12);
					textArea.setFont(font);
					
				}
		}
	

	
	
	public static void main(String[] args) {
		
		new Notepad();
	}

}
