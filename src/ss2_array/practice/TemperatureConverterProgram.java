package ss2_array.practice;
import java.util.Scanner;

public class TemperatureConverterProgram {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("----- Menu -----"
                    + "\n1. Fahrenheit to Celsius"
                    + "\n2. Celsius to Fahrenheit"
                    + "\n0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit degrees: ");
                    double fahrenheit = sc.nextDouble();
                    System.out.printf("Celsius: %.2f°C",
                            fahrenheitToCelsius(fahrenheit));
                    break;

                case 2:
                    System.out.print("Enter Celsius degrees: ");
                    double celsius = sc.nextDouble();
                    System.out.printf("Fahrenheit: %.2f°F",
                            celsiusToFahrenheit(celsius));
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
        System.out.println("Program exited.");
    }
}