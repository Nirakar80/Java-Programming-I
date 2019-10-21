import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BagelPanel extends JPanel 
{
	public final double EVERYTHING_BAGEL = 1.00;
	public final double SIGNATURE_BAGEL = 1.19;
	
	private JRadioButton everythingbagel;
	private JRadioButton signaturebagel;
	
	private ButtonGroup group;
	
	public BagelPanel()
	{
		setLayout(new GridLayout(2,1));
		everythingbagel = new JRadioButton("Everything" , true);
		signaturebagel = new JRadioButton("Signature" , false);
		
		group = new ButtonGroup();
		group.add(everythingbagel);
		group.add(signaturebagel);
		
		setBorder(BorderFactory.createTitledBorder("Bagel"));
		
		add(everythingbagel);
		add(signaturebagel);
	}
	
	public double getBagelCost()
	{
		double bagelCost = 0.0;
		
		if	(everythingbagel.isSelected())
			bagelCost = EVERYTHING_BAGEL;
		else
			bagelCost = SIGNATURE_BAGEL;
		
		return bagelCost;
		
	}
}
