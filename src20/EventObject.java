import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventObject {

	public static void main(String[] args) {

		JFrame box;
		JPanel panel;
		JButton button1;
		JButton button2;
		JButton button3;
		
		box= new JFrame();
		box.setTitle("EventObjectDemo");
		box.setSize(300, 70);
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("Button1");
		button1.addActionListener(new ButtonListener());
		button2 = new JButton("Button2");
		button2.addActionListener(new ButtonListener());
		button3 = new JButton("Button3");
		button3.addActionListener(new ButtonListener());
		
		panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		box.add(panel);
		
		box.setVisible(true);
		
	}

}
