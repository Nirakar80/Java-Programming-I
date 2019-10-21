
public class SpeedConverter {

	public static void main(String[] args) {
	
		final int str_kph = 60;
		final int max_kph = 130;
		final int incr = 10;
		
		int kph;
		double mph;
		
		System.out.println("KPH\t\tMPH");
		System.out.println("--------------------");

		for (kph = str_kph; kph <= max_kph; kph += incr)
		{
			mph = kph*0.6214;
			System.out.printf("%d\t\t%.1f\n",kph,mph);
		}

	}

}
