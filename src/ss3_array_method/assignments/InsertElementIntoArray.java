package ss3_array_method.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementIntoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        System.out.print("Enter the element to be inserted: ");
        int x = sc.nextInt();
        int indexIns = -1;
        do {
            System.out.print("Enter the index to be inserted: ");
            indexIns = sc.nextInt();
            if (indexIns <= -1 || indexIns > arr.length - 1) System.out.println("Invalid index!");
        } while (indexIns <= -1 || indexIns > arr.length - 1);

        arr = Arrays.copyOf(arr, arr.length + 1);
        for (int i = arr.length - 1; i > indexIns; i--) {
            arr[i] = arr[i - 1];
        }
        arr[indexIns] = x;
        System.out.println("Array after insertion: " + Arrays.toString(arr));

        sc.close();
    }
}
