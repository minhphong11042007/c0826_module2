package ss4_class_object.argument.StopWatch;

import java.util.Random;

public class Run {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(100000);

        StopWatch timer = new StopWatch();
        timer.start();
        selectionSort(numbers);
        timer.stop();
        System.out.println("Execution time of Selection Sort for 100,000 numbers: " + timer.getElapsedTime() + " ms");
    }
}
