package BasicMaths;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
