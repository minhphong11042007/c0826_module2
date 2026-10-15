package ss1_java_overview.assignments;

import java.util.Scanner;

public class p_calculate_body_mass_index_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height in meters: ");
        double height = sc.nextDouble();

        System.out.print("Enter the weight in kilograms: ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("%-20s%s%n", "BMI", "Interpretation");

        String interpretation;
        if (bmi < 18.5) {
            interpretation = "Underweight";
        } else if (bmi < 25.0) {
            interpretation = "Normal";
        } else if (bmi < 30.0) {
            interpretation = "Overweight";
        } else {
            interpretation = "Obese";
        }
        System.out.printf("%-20.2f%s%n", bmi, interpretation);

        sc.close();
    }
}
