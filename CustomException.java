package Tutorial10;

import java.util.Scanner;

class InvalidNumberException extends Exception {

	private static final long serialVersionUID = 1L;

public InvalidNumberException(String message) {
     super(message);
 }
}
public class CustomException {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int sum = 0;
     int count = 0;
 

     System.out.println("Enter 5 Numbers");

     for (int i = 0; i < 5; i++) {
    	 System.out.print((i+1)+" Number :");
         int number = sc.nextInt();
         try {
             if (number <= 0) {
                 throw new InvalidNumberException("invalid Number~ " + number);
             } else {
                 sum += number;
                 count++;
             }
         } catch (InvalidNumberException e) {
             System.out.println(e.getMessage());
         }
     }

     if (count > 0) {
         double average = (double) sum / count;
         System.out.println("\nSum of the numbers are: " + sum);
         System.out.println("Average of the numbers: " + average);
     } else {
         System.out.println("No valid positive numbers entered.");
     }

     sc.close();
 }
}

