package ss1_java_overview;

import java.util.Scanner;

public class p_check_for_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();


        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.printf("%d is a leap year%n", year);
        } else {
            System.out.printf("%d is NOT a leap year%n", year);
        }

        sc.close();
    }
}
