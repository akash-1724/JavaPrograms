package Tuturial4;
import java.util.Scanner;
public class sumOfDiagMatrx {
 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = sc.nextInt();
	        
	        int[][] matrix = new int[rows][cols];
	        
	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }
	        
	        int mainDiagonal = 0;
	        int offDiagonalSum = 0;
	        
	        for (int i = 0; i < rows; i++) {
	            mainDiagonal += matrix[i][i]; 
	            offDiagonalSum += matrix[i][cols - 1 - i];
	        }
	        
	        System.out.println("Sum of the primary diagonal: " + mainDiagonal);
	        System.out.println("Sum of the secondary diagonal: " + offDiagonalSum);
	        
	        sc.close();
	    }
	}
