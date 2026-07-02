package Recursion;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series up to " + n + " terms: "+fibonacci(n));

    }

    private static int fibonacci(int N) {
        if(N<=1) return N;
        int res = fibonacci(N-1)+fibonacci(N-2);
        return res;
    }
}
