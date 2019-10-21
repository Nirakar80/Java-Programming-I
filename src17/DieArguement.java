
public class DieArguement {

	public static void main(String[] args) {

		final int EIGHT_SIDES = 8;
		final int TWENTY_SIDES = 20;

		Die eightDie = new Die(EIGHT_SIDES);
		Die twentyDie = new Die(TWENTY_SIDES);
		
		rollDie(eightDie);
		rollDie(twentyDie);
		
		
	}

	public static void rollDie(Die die) 
	{
		System.out.println("ROlling a "+ die.getSides()+" sided Die." );
		die.roll();
		System.out.println("THe die's value is " + die.getValue());
		
	}

}
