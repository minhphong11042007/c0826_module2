package ss1_java_overview;

import java.util.Scanner;

public class ass_currency_converter_application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the exchange rate (e.g., 25000): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the amount in USD: ");
        double usdAmount = sc.nextDouble();

        double convertedAmount = usdAmount * rate;
        System.out.printf("Result: %,.2f USD = %,.2f VND", usdAmount, convertedAmount);

        sc.close();
    }
}
