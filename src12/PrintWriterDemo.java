import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter studentOutputFile = new PrintWriter("Studentdata.txt");
		
		studentOutputFile.println("Nirakar");
		studentOutputFile.println(95);
		studentOutputFile.println("Sam");
		studentOutputFile.println(93.75);
		studentOutputFile.println("Yosh");
		studentOutputFile.println(98);
		
		studentOutputFile.close();
		
	}

}
