import java.util.Scanner;

public class SoccerTeam {

	public static void main(String[] args) {
		
		final int min = 9;
		final int max = 15;
		int players = 30;
		int teamSize;
		int teams;
		int leftOver;
		Scanner in = new Scanner (System.in);
		
		System.out .print("Enter the number of players per team: ");
		teamSize = in.nextInt();
		
		while (teamSize < min || teamSize > max)
		{
			if (teamSize<min)
			System.out.println("You have to have atleast 9 players.");
			else
			System.out.println("You can have only 15 players.");
			
			System.out .print("Enter the number of players per team: ");
			teamSize = in.nextInt();
		}
		
			teams = players/ teamSize;
			leftOver = players % teamSize;
			
			System.out.println("There would be "+ teams
					+ " teams with " +leftOver+ " leftover players.");
	}

}
