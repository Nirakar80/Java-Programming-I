import java.util.Scanner;
public class AvgScr {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first score: ");
		double score1 = in.nextDouble();
		
		System.out.print("Enter second number: ");
		double score2 = in.nextDouble();
		
		double average = (score1+score2)/2;
		
		System.out.println("");
		System.out.println("The average score is "+average);
		
	
		if(average >= 90) {
			System.out.println("You got A" );
			}
		else if (average >=80) {
			System.out.println("You got B");
			}
		else if(average>=70) {
			System.out.print("You got C");
			}
		else if(average>=60) {
			System.out.print("You got D");
			}
		else if(average>=50) {
			System.out.print("You got E");
			}
		else if(average>40) {
			System.out.print("You got F");
			}
		else  {
			System.out.print("You faile!! :(");
			}
		
		
		
		
		
	
	
		}
	
	}

