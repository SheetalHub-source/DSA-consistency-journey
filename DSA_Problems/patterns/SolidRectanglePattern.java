package patterns;

import java.util.Scanner;

public class SolidRectanglePattern {
    public static void printSolidRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printSolidRectangle(n);
            sc.close();
    }
}
