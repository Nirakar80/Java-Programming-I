import java.util.Scanner;

public class RectangularPattern {

	public static void main(String[] args) {
		
		int rows;
		int columns;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		rows = in.nextInt();
		
		System.out.print("Enter the number of columns: ");
		columns = in.nextInt();
		
		System.out.println("");
		
		for (int r =0;r<rows;r++)
		{
			for (int c=0;c<columns;c++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
