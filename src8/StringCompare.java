
public class StringCompare {

	public static void main(String[] args) {

		String name1 = new String("Mark");
		String name2 = new String("Mark");
		String name3 = new String("Mary");
		
		
		if (name1 == name2)
		{
			System.out.println(name1 +" and "+name2 +" are the same object.");
		}
		else
		{
			System.out.println(name1 +" and "+name2 +" are NOT the same object.");
		}
		
		if (name1.equals(name2))
		{
			System.out.println(name1 +" and "+name2 +" are the same object.");
		}
		else
		{
			System.out.println(name1 +" and "+name2 +" are NOT the same object.");
		}
		
		if (name3.equalsIgnoreCase("MAry"))
			System.out.println("The third name is Mary.");
		else
			System.out.print("The third name isn't Mary.");
		
	}
	

}
