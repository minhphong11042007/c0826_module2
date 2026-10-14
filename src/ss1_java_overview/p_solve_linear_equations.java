package ss1_java_overview;

import java.util.Scanner;

public class p_solve_linear_equations {
    public static void main(String[] args) {
        System.out.println("Linear equation resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        if (a!=0) {
            double answer = (c-b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b==c) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution found!");
            }
        }
    }
}
