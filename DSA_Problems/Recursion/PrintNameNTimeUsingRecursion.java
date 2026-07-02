package Recursion;

public class PrintNameNTimeUsingRecursion {
    public static void printName(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print("Sheetal"+" ");
        printName(n - 1);
    }

    public static void main(String[] args) {
        int n = 100;
        printName(n);
    }
}
