package Tutorial3;
import java.util.Scanner;
public class factorialUsingWhile {
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter the number :");
		int num=sc.nextInt();
		int i=1, fact = 1;
		
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		
		System.out.println("The factorial of "+num+" is "+fact);
		sc.close();
	}

}
