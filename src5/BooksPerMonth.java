
public class BooksPerMonth {

	public static void main(String[] args) {
	
		int books = 15;
		int months = 6;
		double booksPerMonth;
		
		System.out.print("I want to read ");
		System.out.print(books);
		System.out.print(" books in ");
		System.out.print(months + " months.");
		
		booksPerMonth = books/(double)months;
		
		System.out.println("I have to read " + booksPerMonth +" books per month in average.");
		
		System.out.println ("I could aslo read " +Math.ceil(booksPerMonth)+ " books per month.");

	}

}
