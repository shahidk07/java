// Matrix Multiplication
import java.util.Arrays;

public class exp_3_8_b {
    public static void main(String[] args) {

        int matA[][] = {
                {1, 2},
                {2, 1}
        };

        int matB[][] = {
                {1, 2},
                {2, 1}
        };

        // Dimensions
        int i = matA.length;        // rows of A
        int j = matA[0].length;    // cols of A

        int a = matB.length;       // rows of B
        int b = matB[0].length;   // cols of B

        int matProd[][] = new int[i][b];

        // Check condition
        if (j != a) {
            System.out.println("Matrix dimensions do not support multiplication");
            return;
        }

        // Print Matrix A
        System.out.println("Matrix A:");
        for (int row = 0; row < i; row++) {
            for (int col = 0; col < j; col++) {
                System.out.print(matA[row][col] + " ");
            }
            System.out.println();
        }

        // Print Matrix B
        System.out.println("\nMatrix B:");
        for (int row = 0; row < a; row++) {
            for (int col = 0; col < b; col++) {
                System.out.print(matB[row][col] + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication Logic
        for (int row = 0; row < i; row++) {
            for (int col = 0; col < b; col++) {
                for (int k = 0; k < j; k++) {
                    matProd[row][col] += matA[row][k] * matB[k][col];
                }
            }
        }

        // Print Result
        System.out.println("\nProduct Matrix:");
        for (int row = 0; row < i; row++) {
            for (int col = 0; col < b; col++) {
                System.out.print(matProd[row][col] + " ");
            }
            System.out.println();
        }
    }
}