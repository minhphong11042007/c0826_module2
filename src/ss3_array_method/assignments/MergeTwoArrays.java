package ss3_array_method.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
    public static int[] createArray(Scanner sc) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Display the array: " + Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = createArray(sc);
        int[] arr2 = createArray(sc);

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println("Display the array: " + Arrays.toString(arr3));

        sc.close();








    }
}
