
public class PassArray {

	public static void main(String[] args) {
		
		int[] numbers = { 20, 30, 40, 50, 60};
		
		System.out.print("Here are the numbers in the array: ");
		showArray(numbers);
		
		System.out.println("Sum of all the numbers in the array is " + arraySum(numbers));

	}
	
	public static void showArray(int[] array)
	{
		for( int index=0; index < array.length; index++)
			{
			System.out.print(array[index] + " ");
			}
		System.out.println();
	}
	
	public static int arraySum(int[] array)
	{
		int sum = 0 ;
		for (int index =0; index < array.length; index++)
		{
			sum += array[index];
		}
		return sum; 
	}

}
