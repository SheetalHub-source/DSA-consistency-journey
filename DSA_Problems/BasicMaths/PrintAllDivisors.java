package BasicMaths;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {
//    static void printDivisors(int n) {
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int n = 36;
//        printDivisors(n);
//    }

    public List<Integer> getDivisors(int N) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                res.add(i);
                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }

        // Return the list of divisors
        return res;
    }
    public static void main(String[] args) {
        PrintAllDivisors sol = new PrintAllDivisors();
        int N = 36;

        List<Integer> result = sol.getDivisors(N);
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}
