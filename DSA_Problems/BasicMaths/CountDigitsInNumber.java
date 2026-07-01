package BasicMaths;

public class CountDigitsInNumber {
    public int countDigit(int n) {
int count=0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountDigitsInNumber obj = new CountDigitsInNumber();
            int n = 999999889;
            int count = obj.countDigit(n);
            System.out.println("The number of digits in " + n + " is: " + count);
    }
}
