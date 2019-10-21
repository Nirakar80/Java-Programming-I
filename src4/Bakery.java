
public class Bakery {

	public static void main(String[] args) {

		int pies;
		int people;
		double piespp;
		
		pies = 10;
		people = 4;
		
		piespp = pies/people;
		System.out.println( "The pies per person is "+ piespp);
		
		piespp = (double) pies/people;
		System.out.println( "The pies per person is "+ piespp);
				
		piespp = pies/(double)people;
		System.out.println( "The pies per person is "+ piespp);
	}

}

