package ss2;

import java.util.Scanner;

public class DisplayVariousShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("---------------Menu---------------"
            + "\n1. Print the rectangle"
            + "\n2. Print the right triangle"
            + "\n3. Print the isosceles triangle"
            + "\n0. Exit");
            System.out.print("What is your choice? ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the length of the rectangle: ");
                    int m = sc.nextInt();
                    System.out.print("Enter the width of the rectangle: ");
                    int n = sc.nextInt();
                    for (int i = 1; i <= m; i++) {
                        for (int j = 1; j <= n; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("The right angle is located at 4 different corners"
                            + "\n1. Top-left"
                            + "\n2. Top-right"
                            + "\n3. Bottom-left"
                            + "\n4. Bottom-right"
                            + "\n0. Exit");
                    System.out.print("What is your choice? ");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("--- 1. Top-left ---");
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("--- 2. Top-right ---");
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= 5 - i; j++) System.out.print("  ");
                                for (int j = 1; j <= i; j++) System.out.print("* ");
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("--- 3. Bottom-left ---");
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println("--- 4. Bottom-right ---");
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= 5 - i; j++) System.out.print("  ");
                                for (int j = 1; j <= i; j++) System.out.print("* ");
                                System.out.println();
                            }
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("---Isosceles triangle---");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
