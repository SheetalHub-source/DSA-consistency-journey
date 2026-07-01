package BasicMaths;

public class ReverseNumber {
    static void reverseNumber(int n){
        int reversed =0;
        while(n!=0){
            int digit = n%10;
            reversed = reversed*10 + digit;
            n/=10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
    static boolean isPalindromeNumber(int n){
        int original = n;
        int reversed =0;
        while(n!=0){
            int digit = n%10;
            reversed = reversed*10 + digit;
            n/=10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to reverse:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        reverseNumber(n);
        if(isPalindromeNumber(n)){
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " method executed successfully.");
        sc.close();
    }
}
