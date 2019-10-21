import  java.util.Random;
public class UserSquare {

	public static void main(String[] args) {
		
		int num;
		int maxValue;
		
		Random random = new Random();
		maxValue = random.nextInt(20);
		System.out.println("");

		System.out.println("Number  |  Number Squared");
		System.out.println("-------------------------");

		for (num=1; num<=maxValue; num++)
		System.out.println("   "+num+"\t\t"+ num*num);
	}

}
