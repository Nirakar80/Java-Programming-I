import java.util.Scanner;

public class SecretWord {
	
	public final void main(String[] args)
	{
		String input;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your password ");
		input = in.nextLine();
		
		while ( input.equals("prospero")== false)
		{
			System.out.println("Incorrect password. ");
			System.out.print("Enter your password again.");
			input = in.nextLine();
		}
		
		System.out.println("Successful Login! ");
	
	
	}
	
}

