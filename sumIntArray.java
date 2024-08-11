package Tuturial4;

import java.util.Scanner;

public class sumIntArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        
	        int[] numbers = new int[n];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        int sum = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
	        System.out.println("The sum of all elements in the array is: " + sum);
	        scanner.close();
	  }
}
