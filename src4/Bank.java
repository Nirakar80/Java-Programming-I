
public class Bank {

	public static void main(String[] args) {

		double balance;
		double deposit;
		double withdrawal;
		
		balance = 750;
		deposit = 80;
		withdrawal = 50;
		System.out.println("The balance is $" + balance);
		
		// this is the same as balance = balance + deposit
		balance += deposit;
		System.out.println("The balance is $"+ balance);
		
			
		balance -= withdrawal;
		System.out.println("The balance is $"+ balance);
		

	}

}
