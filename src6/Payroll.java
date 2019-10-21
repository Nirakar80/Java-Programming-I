import java.util.Scanner;

public class Payroll {

	private static Scanner keyboard;
	
	public static void main(String[] args) {
		
	String n;
	int h;
	double r;
	double p;
	keyboard = new Scanner( System.in);
	
	System.out.print("What's your name?");
	String name = keyboard.nextLine();
	
	System.out.print("How many hour's did you work?");
	h = keyboard.nextInt();
	
	System.out.print("What is your pay rate?");
	r = keyboard.nextDouble();
	
	n= name.substring(0,1).toUpperCase() + name.substring(1);
	p = h*r;
	
	System.out.print("Hello! "+ n+"."+" Your gross pay is $"+p+".");
	
	
		
	}

}
