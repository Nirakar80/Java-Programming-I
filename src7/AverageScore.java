import javax.swing.JOptionPane;
public class AverageScore {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Input the first score");
		String b = JOptionPane.showInputDialog("Input the second score");
		
		double score1 = Double.parseDouble(a);
		double score2 = Double.parseDouble(b);
		double average = (score1+score2)/2;
		
		JOptionPane.showMessageDialog(null ,"The average score is: "+ average);
		
		if(average >= 90) {
			JOptionPane.showMessageDialog(null ,"You got A" );
			}
		else if (average >= 80) {
			JOptionPane.showMessageDialog(null ,"You got B .");
			}
		else if (average >= 70) {
			JOptionPane.showMessageDialog(null ,"You got C.");
			}
		else if (average >= 60) {
			JOptionPane.showMessageDialog(null ,"You got D.");
			}
		else if (average >= 50) {
			JOptionPane.showMessageDialog(null ,"You got E.");
			}
		else if (average >=40) {
			JOptionPane.showMessageDialog(null ,"You got F.");
			}
		else 
			JOptionPane.showMessageDialog(null ,"Meet me ASAP!!");
			}
	

}
