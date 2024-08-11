package Lab1;

import java.util.Scanner;
public class reverseNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number :");
		int num=sc.nextInt();
		sc.close();
		
		int temp=num,k,rev=0;
		while(temp!=0) {
			k=temp%10;
			rev=rev*10+k;
			temp/=10;
		}
		
		System.out.println("Reverse of the number is :"+rev);
	}
}
