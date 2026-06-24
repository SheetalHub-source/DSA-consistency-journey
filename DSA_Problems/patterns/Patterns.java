package patterns;

public class Patterns {
    private static char letter;

    public static void main(String[] args) {
        int n = 5;
        printPalindromicLetterPyramid(n);
    }

    private static void printInvertedHalfPyramid(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printInvertedHalfNumbers(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printFullPyramidPattern(int n) {
        int a = n, b = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - 1) + 1; j++) {
                if (j >= a && j <= b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            a--;
            b++;

        }
    }
    private static void printInvertedFullPyramidPattern(int n) {
        int a = 1, b = 2 * (n - 1) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - 1) + 1; j++) {
                if (j >= a && j <= b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            a++;
            b--;

        }
    }
    private static void printDiamondPattern(int n){
        printFullPyramidPattern(n);
        int a = 2, b = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - 1) + 1; j++) {
                if (j >= a && j <= b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            a++;
            b--;

        }
    }
    private static  void printRightHalfDiamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static  void printZeroOneTrianglePattern(int n){
        int binary = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(binary+" ");
                binary= binary==0?1:0;
            }
            System.out.println();
        }
    }
    private static void printNumberCrownPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(j<=i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j =n;j>=1;j--){
                if(j<=i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void printLetterHalfPyramid(int n){
       char character = 'A';
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                char letter = (char) (character + j);
                System.out.print(letter);
            }
            System.out.println();
    }}
    private static void printInvertedLetterHalfPyramid(int n){
        char character = 'A';
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                char letter = (char) (character + j);
                System.out.print(letter);
            }
            System.out.println();
        }}
    private static void printRepeatingLetterHalfPyramid(int n){
        char character = 'A';
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
//                char letter = (char) (character + j);
//                System.out.print(letter);
                System.out.print(character);
            }
            character++;
            System.out.println();
        }}
    private static void printPalindromicLetterPyramid(int n) {
//        char character = 'A';
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<i;j++){
//                char letter = (char) (character + j);
//                System.out.print(letter);
//            }
//            for(int j=i-2;j>=0;j--){
//                char letter = (char) (character + j);
//                System.out.print(letter);
//            }
//            character++;
//            System.out.println();
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                char letter = (char) ('A' + j);
                System.out.print(letter);
            }
            for (int j = 1; j <= i; j++) {
                char letter = (char) ('A' + j);
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    }


