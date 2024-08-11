package Tutorial6;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String str1=str.substring(0,2);
		System.out.println(str1);
		if(str.endsWith(str1)){
			System.out.println("The string"+" "+str+" ends with"+" "+str1);
		}
		else {
			System.out.println("The string"+" "+str+" donot ends with"+" "+str1);	
		}
		sc.close();
	}

}