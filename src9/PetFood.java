import java.util.Scanner;

public class PetFood {

	public static void main(String[] args) {
	
		String input;
		char feedGrade;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Our pet food is available in Grade A, B or C");
		System.out.print("Which do you want pricing for? ");
		input = in.nextLine();
		feedGrade = input.charAt(0);
		
		switch (feedGrade)
		{
			case 'a':
			case 'A':
				System.out.println("30 cents per lb.");
			break;
				
			case 'b':
			case 'B':
				System.out.println("20 cents per lb.");
			break;
			
			case 'c':
			case 'C':
				System.out.println("15 cents per lb.");
			break;
			
			default:
				System.out.println("You entered a wrong Grade.");
		}		
	}

}
