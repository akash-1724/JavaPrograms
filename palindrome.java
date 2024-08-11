package Lab2;
import java.util.Scanner;
public class palindrome {
	boolean flag= true;

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		System.out.println("Enter the String :");
		String str= sc.nextLine();
		sc.close();
		
		int l=str.length();
		for(int i=0;i<l/2;i++) {
			if(str.charAt(i)!=str.charAt(l-i-1)) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("It is a palindrome ");
		}
		else {
			System.out.println("It is not a palindrome");		
		}
	}	
}
