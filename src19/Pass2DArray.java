
public class Pass2DArray {

	public static void main(String[] args) {

		int[][] numbers= { { 1, 2, 3},
						   { 4, 5, 6},
						   { 7, 8, 9}	};
		
 		showArray(numbers);                                              
		
	}
	
	public static void showArray(int[][] array)
	{
		for( int row = 0; row < array.length; row++)
		{
			for (int column = 0; column < array[row].length; column++)
			{
				System.out.print(array[row][column] + " ");
			}
			System.out.println();
		}
	}

}
