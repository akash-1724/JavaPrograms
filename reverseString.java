package Tutorial6;

import java.util.Scanner;

public class reverseString {
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the string:");
			String str=sc.nextLine();
			str=str.toLowerCase();
			int len=str.length();
			
			String revString=" ";

			for(int i=len-1;i>=0;i--) {
				revString+=str.charAt(i);	
			}
			sc.close();
			System.out.println("Reverse String is"+" "+revString);
		}
}

