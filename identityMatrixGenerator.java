package Tutorial5;

import java.util.Scanner;

public class identityMatrixGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the identity matrix: ");
        int size = scanner.nextInt();
        int[][] identityMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    identityMatrix[i][j] = 1;
                } else {
                    identityMatrix[i][j] = 0;
                }
            }
        }
        System.out.println("Identity matrix of size " + size + "x" + size + ":");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(identityMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
