package ss1_java_overview;

import java.util.Scanner;

public class ass_numbers_to_words_converter_application {
    public static String readNumberUnder20(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            default:
                return "";
        }
    }
    public static String readNumberUnder100(int number) {
        if (number < 20)
            return readNumberUnder20(number);
        int tens = number / 10;
        int units = number % 10;

        String tensWord = "";
        switch (tens) {
            case 2:
                tensWord = "Twenty";
                break;
            case 3:
                tensWord = "Thirty";
                break;
            case 4:
                tensWord = "Forty";
                break;
            case 5:
                tensWord = "Fifty";
                break;
            case 6:
                tensWord = "Sixty";
                break;
            case 7:
                tensWord = "Seventy";
                break;
            case 8:
                tensWord = "Eighty";
                break;
            case 9:
                tensWord = "Ninety";
                break;
        }
        if (units == 0) return tensWord;
        return tensWord + "-" + readNumberUnder20(units);
    }
    public static String readNumberUnder1000(int number) {
        if (number < 100) return readNumberUnder100(number);
        int hundred = number / 100;
        int remainder = number % 100;
        String hundredWord = readNumberUnder20(hundred) + " hundred";
        if (remainder == 0) return hundredWord;
        return hundredWord + " " + readNumberUnder100(remainder);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number (0 <= n <= 999): ");
        int number = sc.nextInt();
        System.out.println(readNumberUnder1000(number));
    }
}
