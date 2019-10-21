import java.util.Scanner;
public class Whileloop {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter a string: ");
	String a = in.nextLine();
	
	int l = a.length();
	int i = 0;
	
	while (i<l);
	String p = a.substring(i);
	System.out.println(p);
	i += 1 ;
	
	
	
	}

	
		
}
