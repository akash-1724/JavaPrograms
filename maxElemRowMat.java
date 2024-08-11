package Tutorial5;
import java.util.Scanner;

public class maxElemRowMat {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Element at position (" + i + ", " + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("\n");
        }

        int[] max = new int[row];
        int maxElement=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int k = matrix[i][j];
                if (k > maxElement) {
                    maxElement = k;
                }
            }
            max[i] = maxElement;
        }

        System.out.println("Maximum elements in each Row is:");
        for (int i = 0; i < row; i++) {
            System.out.println("Row " + i+1 + ": " + max[i]);
        }
    }
}
