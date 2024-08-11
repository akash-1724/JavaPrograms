package Tutorial6;
import java.util.Scanner;
public class charCounter {	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int word=0,alph=0,line=0,num=0,space=0;
			System.out.println("Enter the string:");
			String str=sc.nextLine();
			str=str.toLowerCase();
			int len=str.length();
			for(int i=0;i<len;i++) {
				if(str.charAt(i)==' ' || str.charAt(i)=='.') {
					word++;
					}
				if(str.charAt(i)=='\n') {
					line++;
				}
	            if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
	            	alph++;
	            }
	            if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
	            	num++;
	            }
	            if(str.charAt(i)==' ') {
	            	space++;	
	            }
			}
	            System.out.println("Number of characters"+" "+len);
	            System.out.println("Number of words"+" "+word);
	            System.out.println("Number of alphabets"+" "+alph);
	            System.out.println("Number of lines"+" "+(line+1));
	            System.out.println("Number of digits"+" "+num);
	            System.out.println("Number of spaces"+" "+space);	
	            sc.close();
		}
}
