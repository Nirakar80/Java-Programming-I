import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("James");
		nameList.add("Catherine");
		nameList.add("Bill");
		
	for (int i = 0; i < nameList.size(); i++)
	{
		System.out.print(nameList.get(i) + " ");
	}
	System.out.println();
	
	for (String num : nameList)
	{
		System.out.print(num + " ");
	}
	System.out.println();
	
	System.out.println(nameList);

	nameList.remove(1);
	System.out.println(nameList);
	
	nameList.add(1, "Mary");
	System.out.println(nameList);
	}
	


}
