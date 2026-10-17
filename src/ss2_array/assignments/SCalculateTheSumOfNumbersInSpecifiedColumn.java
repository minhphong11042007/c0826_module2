package ss2_array.assignments;

import java.util.Scanner;

public class SCalculateTheSumOfNumbersInSpecifiedColumn {
    public static double[][] create2DArray(Scanner sc) {
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
        return matrix;
    }

    public static void display2DArray(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = create2DArray(sc);
        display2DArray(matrix);
        int column = -1;
        do {
            System.out.println("Enter number the column you want to calculate: ");
            column = sc.nextInt();
            if (column < 0 || column >= matrix[0].length)
                System.out.println("Invalid column index!");
        } while (column < 0 || column >= matrix[0].length);

        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][column];
        }
        System.out.println("The sum of the specified column is: " + sum);

        sc.close();
    }
}
