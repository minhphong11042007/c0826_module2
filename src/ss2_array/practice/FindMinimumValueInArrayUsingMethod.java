package ss2_array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumValueInArrayUsingMethod {
    public static int minValue(int[] arr) {
        int temp = 10^9;
        for (int number : arr)  if (number < temp) temp = number;
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Display array: " + Arrays.toString(arr));
        System.out.println("Minimum value is: " + minValue(arr));
    }
}
