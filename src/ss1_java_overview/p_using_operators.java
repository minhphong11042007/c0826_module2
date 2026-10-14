package ss1_java_overview;

import java.util.Scanner;

public class p_using_operators {
    public static void main(String[] args) {
        float height;
        float width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height in meters: ");
        height = sc.nextFloat();
        System.out.print("Enter the width in meters: ");
        width = sc.nextFloat();
        float area = height * width;
        System.out.println("Area is " + area);
    }
}
