package Tuturial4;
import java.util.Scanner;
public class maxMinArrInt {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        
	        int[] numbers = new int[n];
	        
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        
	        int min = numbers[0];
	        int max = numbers[0];
	        
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            } else if (numbers[i] < min) {
	                min = numbers[i];
	            }
	        }
	        
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	        
	        scanner.close();
	    }
	}
