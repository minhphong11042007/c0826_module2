package ss2;

public class DisplayTheFirst20PrimeNumbers {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 2;
        int count = 0;

        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}