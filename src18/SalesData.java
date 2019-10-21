
public class SalesData 
{
	private double[] sales;
	private double Total;
	private double highest;
	private double lowest;
	private double Average;
	
	public SalesData(double[] newSales)
	{
		sales = new double[newSales.length];
		
		for (int index= 0; index < newSales.length; index++)
		{
			sales[index] = newSales[index];
		}
	}

	public double getTotal()
	{	
		for (int index= 0; index < sales.length; index++)
		{
			Total += sales[index];
		}
	return Total;
	}

	
	public double getAverage() 
	{
		Average = Total/(sales.length);
	return Average;
	}

	public double getHighest()
	{	
		highest = sales[0];
		for (int index= 1; index < sales.length; index++)
		{
			if (highest <= sales[index])
			{
				highest = sales[index];
			}
			
		}
	return highest;
	}

	public double getLowest() 
	{
		lowest = sales[0];
		for (int index= 1; index < sales.length; index++)
		{
		if (lowest >= sales[index])
			{
			lowest = sales[index];
			}
		
		}
	return lowest;
	}
	
	
	

}	
