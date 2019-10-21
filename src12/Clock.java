
public class Clock {

	public static void main(String[] args) throws InterruptedException  {	
		for (int h=1;h<=12;h++) 
		{
			for (int m=0;m<=59;m++)
			{
				for (int s=0;s<=59;s++)
				{
						
					System.out.printf("%02d:%02d:%02d\n", h,m,s);
					 Thread.sleep(1000);
				}
			}
		}
	
	}

}
