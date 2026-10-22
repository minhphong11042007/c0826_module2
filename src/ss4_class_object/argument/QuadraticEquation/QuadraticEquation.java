package ss4_class_object.argument.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    public void QuadraticEquation() {
    }

    public void QuadraticEquation(double a, double b, double c) { //Overload nè
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void inputArguments(Scanner sc) {
        do {
            System.out.print("Enter a (a != 0): ");
            a = sc.nextDouble();
            if (a == 0) {
                System.out.println("This is not a quadratic equation! Please try again.");
            }
        } while (a == 0);
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        System.out.print("Enter c: ");
        c = sc.nextDouble();
    }

    public void displayQuadraticEquation() {
        System.out.printf("The quadratic equation is: %.2fx^2 + %.2fx + %.2f = 0%n", a, b, c);
    }

    public double getDiscriminant() {
        return b*b - 4*a*c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public void solveEquation() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            System.out.println("The equation has no real roots!");
        } else if (discriminant == 0) {
            System.out.printf("The equation has a double root: x = %.2f%n", -b / (2 * a));
        } else {
            System.out.printf( "The equation has two distinct roots: x1 = %.2f; x2 = %.2f%n", getRoot1(), getRoot2() );
        }
    }
}