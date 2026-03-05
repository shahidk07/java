import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];

        System.out.println("Enter 16 integers:");

        // Taking input for first 3 rows
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Calculating column sums and storing in last row
        for (int j = 0; j < 4; j++) {
            a[3][j] = 0;   // initialize sum
            for (int i = 0; i < 3; i++) {
                a[3][j] += a[i][j];
            }
        }

        // Printing the matrix
        System.out.println("\nMatrix with column sums:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

