package Lab1;
import java.util.Scanner;

public class matrixmultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N; // Dimension of the square matrix

        System.out.print("Enter the dimension (N) for the square matrix: ");
        N = scanner.nextInt();

        int[][] mat1 = new int[N][N];
        int[][] mat2 = new int[N][N];

        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

    

        scanner.close();
    }
}
