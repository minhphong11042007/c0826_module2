package ss2_array.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
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

        System.out.print("Enter the element to be removed: ");
        int x = sc.nextInt();

        int indexDel = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indexDel = i;
                break;
            }
        }

        if (indexDel != -1) {
            for (int i = indexDel; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr = Arrays.copyOf(arr, arr.length - 1);

            System.out.println("Array after removal: " + Arrays.toString(arr));
        } else {
            System.out.println("Element not found!");
        }

        sc.close();
    }
}