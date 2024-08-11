package Tuturial4;
import java.util.Scanner;
public class searchEleMatrix {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int columns = sc.nextInt();
	   
	        int[][] array = new int[rows][columns];

	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Element at position [" + i + "][" + j + "]: ");
	                array[i][j] = sc.nextInt();
	            }
	        }

		        System.out.print("Enter the element to search for: ");
	        int num = sc.nextInt();

	        boolean found = false;
	        int numR = -1;
	        int numC = -1;

	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                if (array[i][j] == num) {
	                	numR = i;
	                	numC = j;
	                    found = true;
	                    break; 
	                }
	            }
	            if (found) {
	                break; 
	            }
	        }

	        if (found) {
	            System.out.println("Element " + num + " found at row " + numR + " and column " + numC);
	        } else {
	            System.out.println("Element " + num + " not found in the array.");
	        }
	        sc.close();
	    }
	}

