import java.util.Scanner;

public class Name {

	private static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		keyboard = new Scanner( System.in);
		System.out.print("What's your name?");
		String firstname= keyboard.nextLine();
		
		System.out.print("What's your last name?");
		String lastname= keyboard.nextLine();
		
		
		System.out.print("How old are you?");
		int age = keyboard.nextInt();
		
		System.out.print("Hello " + firstname+" "+lastname+"." +"You are "+age+" years old.");
		
	}
	

}
