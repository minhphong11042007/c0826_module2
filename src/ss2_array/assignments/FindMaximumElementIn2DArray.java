package ss2_array.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaximumElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int m = sc.nextInt();
        System.out.print("Enter column number: ");
        int n = sc.nextInt();
        double[][] matrix = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter matrix element: [" + i + ", " + j + "]: ");
                matrix[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        double max = matrix[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.println("Maximum element in 2D Array is: " + max);

        sc.close();
    }
}
