package ss2_array.assignments;

import java.util.Scanner;

public class S2DArrayCalculateTheSumOfTheMainDiagonalElementsOfSquareMatrix {
    public static double[][] create2DArraySquareMatrix(Scanner sc) {
        System.out.print("Enter sacle: ");
        int m = sc.nextInt();
        double[][] matrix = new double[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
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
        double[][] matrix = create2DArraySquareMatrix(sc);
        display2DArray(matrix);
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Sum of the main diagonal elements of square matrix is " + sum);

        sc.close();
    }
}
