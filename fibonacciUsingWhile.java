package Tutorial3;
import java.util.Scanner;
public class fibonacciUsingWhile {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the limit :");
		int num=sc.nextInt();
		
		int firstnum=0,nextnum=1,i=0;
		
		System.out.println("The Fibonacci Series upto "+num+" is :");
		System.out.print(firstnum + " ");
		while(i<num-1) {
			int temp= firstnum;
			firstnum=nextnum;
			nextnum=nextnum+temp;
			i++;
			System.out.print(nextnum+" ");
			
		}
		sc.close();
	}
}
