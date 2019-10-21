
public class StringCompare {

	public static void main(String[] args) {
		
		String name1="Mark";
		String name2="Mark";
		String name3="Mary";
		
		if (name2.compareTo(name3)<0) {
			System.out.println(name2+" is less than "+name3);
		}	else if (name2.compareTo(name3)==0) {
			System.out.println(name2+" is equal to "+name3);
		}	else if (name2.compareTo(name3)>0) {
			System.out.println(name2+" is greater than "+name3);
		}
		
		
		if (name1.compareTo(name1)<0) {
			System.out.println(name1+" is less than "+name2);
		}	else if (name1.compareTo(name2)==0) {
			System.out.println(name1+" is equal to "+name2);
		}	else if (name1.compareTo(name2)>0) {
			System.out.println(name1+" is greater than "+name2);
		}
	}
}
