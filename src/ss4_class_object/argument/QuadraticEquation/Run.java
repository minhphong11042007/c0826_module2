package ss4_class_object.argument.QuadraticEquation;;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quadratic Equation: ax^2 + bx + c = 0");

        QuadraticEquation quadraticEquation = new QuadraticEquation();

        quadraticEquation.inputArguments(sc);

        quadraticEquation.displayQuadraticEquation();

        quadraticEquation.solveEquation();

        sc.close();
    }
}