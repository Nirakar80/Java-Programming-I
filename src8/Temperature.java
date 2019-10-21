import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("What is  the temperature? ");
	int t = in.nextInt();
	
	System.out.print("How long has it been in that temperature? ");
	int m = in.nextInt();
	
	if (m>12 && t<20)
	{
		System.out.println("The machine is cold give it a blanket will ya!");
	}

	if (t<20 || t>100) 
	{
		System.out.println("What the hell are you trying to do?");
	}
	
	if (!(t>100))
	{
		System.out.println("Temperature below maximum point!");
	}
  

  }
	

}
