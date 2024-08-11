package Tutorial3;
import java.util.Scanner;
public class reverseUsingWhile {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter the number :");
		int num=sc.nextInt();
	
		int temp=num,rev=0,k,i;

		for(i=0;i>=0;i++) {
			k=temp%10;
			rev=rev*10+k;
			temp=temp/10;
			if(temp==0){
				break;
			}	
		}
		System.out.printf("Reverse :"+rev);
		sc.close();
	}
}
