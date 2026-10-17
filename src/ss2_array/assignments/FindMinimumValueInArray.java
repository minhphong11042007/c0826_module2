package ss2_array.assignments;

import java.util.Scanner;

public class FindMinimumValueInArray {
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

        double min = matrix[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < min)
                    min = matrix[i][j];
            }
        }
        System.out.println("Minimum element in 2D Array is: " + min);

        sc.close();
    }
}
