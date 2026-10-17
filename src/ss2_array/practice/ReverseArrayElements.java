package ss2_array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter the size of the array (1-20): ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));

        sc.close();
    }
}