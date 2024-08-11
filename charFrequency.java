package Lab2;
import java.util.Scanner;
public class charFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
	    System.out.println("Enter the character: ");
	    char f = sc.next().charAt(0);

	    int frequency = 0;
	    for (int i = 0; i < str.length(); i++) {
	    	if (str.charAt(i) == f) {
	    		frequency++;
	            	}
	        	}
	        	System.out.println("No. of occurance : "+ frequency);
	        	sc.close();
	    }
}
	

