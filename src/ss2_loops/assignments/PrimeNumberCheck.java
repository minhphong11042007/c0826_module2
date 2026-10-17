package ss2_loops.assignments;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();

        if (n < 2) System.out.println("Isn't prime number.");
        else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(n) + 1; i++) {
                if (n % i == 0) {
                    System.out.println("Isn't prime number.");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println("Is prime number.");
        }
    }
}
