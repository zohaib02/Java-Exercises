// Import the Java utility for reading input.
import java.util.Scanner;

// Define a class named AddTwoSameSizeMatrices.
public class AddTwoSameSizeMatrices {
    public static void main(String args[]) {
        int m, n, rows, cols;

        // Create a new Scanner object to read user input.
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the number of rows for the matrix.
        System.out.println("Input number of rows of the matrix");
        m = in.nextInt();

        // Prompt the user to input the number of columns for the matrix.
        System.out.println("Input number of columns of the matrix");
        n = in.nextInt();

        // Create two-dimensional arrays to store matrix data.
        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];
        int sum[][] = new int[m][n];

        // Prompt the user to input elements of the first matrix.
        System.out.println("Input elements of the first matrix");
        //rows
        for (rows = 0; rows < m; rows++) {
            //columns
            for (cols = 0; cols < n; cols++) {
                array1[rows][cols] = in.nextInt();
            }
        }

        // Prompt the user to input elements of the second matrix.
        System.out.println("Input elements of the second matrix");
        //rows
        for (rows = 0; rows < m; rows++) {
            //columns
            for (cols = 0; cols < n; cols++) {
                array2[rows][cols] = in.nextInt();
            }
        }

        // Calculate the sum of the matrices.
        //rows
        for (rows = 0; rows < m; rows++) {
            //columns
            for (cols = 0; cols < n; cols++) {
                sum[rows][cols] = array1[rows][cols] + array2[rows][cols];
            }
        }

        // Display the result, which is the sum of the matrices.
        System.out.println("Sum of the matrices:");
        //rows
        for (rows = 0; rows < m; rows++) {
            //columns
            for (cols = 0; cols < n; cols++) {
                System.out.print(sum[rows][cols] + "\t");
            }
            System.out.println();
        }
    }
}
