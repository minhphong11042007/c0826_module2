package ss2.lessons;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String[] cars = {"Hoa", "Giang", "Tâm"};
        System.out.println(Arrays.toString(cars));
        // Tại sao Array là Class, Scanner too, but Array is used literal và Scanner must create an object mới dùng được?
        // Variables of array always written in polural?
        // How to connect to other class??
        // Mang 2 chieu
        int [][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][] array2 = new int[3][4];
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
