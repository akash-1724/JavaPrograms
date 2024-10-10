package Lab6;
import java.util.*;
public class ExceptionHanling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
		System.out.println("****Menu****");
		System.out.println("1.Division \n2.Array");
		System.out.print("Enter the choice: ");
		
		int option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Program to perform Division");
			System.out.println("Enter Number-1: ");
			int a=sc.nextInt();
			System.out.println("Enter Number-2: ");
			int b=sc.nextInt();
			try {  
				int res=a/b;
				System.out.println("Result="+res);
				
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
			finally{
				System.out.println("finally block content");
				System.out.println("My code is safe from exception");
			}
			break;
		case 2:
			System.out.print("Enter the number of elements you want to store: ");
			int n=sc.nextInt();
			int[] A=new int[n];
			System.out.println("Enter the elements of the array:");
			for (int i=0;i<n;i++) {
				A[i]=sc.nextInt();
			}
			System.out.println("Array Length: "+n);
			System.out.println("Array elements are:");
			for(int i=0;i<n;i++) {
				System.out.print(A[i]+"\t");
			}
			System.out.println("\n");
			try {
				System.out.println("Enter the position of element to be accessed:");
				int p=sc.nextInt();
				System.out.println("the element at position"+p+"is: "+A[p]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index out of Bounds");
			}
			break;
		default:
			System.out.println("invaid option");
			break;
		}
		System.out.print("Do you want to continue y or n: ");
		ch=sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		System.out.print("Exiting...");
		sc.close();
	}

}
