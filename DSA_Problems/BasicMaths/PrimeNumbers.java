package BasicMaths;

public class PrimeNumbers {
    static void isPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        System.out.println(n + " is a prime number.");
    }

    public static void main(String[] args) {
        System.out.println("Check if a number is prime or not");
        int n = 29;
        isPrime(n);
    }
}
