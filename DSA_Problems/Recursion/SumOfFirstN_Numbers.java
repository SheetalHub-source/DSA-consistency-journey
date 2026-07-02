package Recursion;

public class SumOfFirstN_Numbers {
    public static int sumOfFirstN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfFirstN(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfFirstN(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
