import java.util.Scanner;

public class CropSales {

	public static void main(String[] args) {
		
		final int DIVS = 3; // three divisions in the company
		final int QTRS = 4;
		double totalSales = 0.0;
		
		double[][] sales = new double[DIVS][QTRS];
		
		Scanner in = new Scanner(System.in);
		
		for(int div = 0; div < DIVS ; div++)
		{
			for(int qtr = 0; qtr<QTRS; qtr++)
			{
				System.out.print("Division "+ (div+1) + ", Quarter "+ (qtr+1) + ": ");
				sales[div][qtr]= in.nextDouble();
			}
			System.out.println(" ");
		}
		
		for(int div = 0; div < DIVS ; div++)
		{
			for(int qtr = 0; qtr<QTRS; qtr++)
			{
				totalSales +=  sales[div][qtr];
			}
		}
		
		System.out.println("The total Company sales is $"+ totalSales);
		
		
	}

}
