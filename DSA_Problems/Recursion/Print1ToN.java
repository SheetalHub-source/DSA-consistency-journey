package Recursion;

public class Print1ToN {
    static void printNumbers(int n){
        if(n==0){
            return;
        }
        printNumbers(n-1);
        System.out.print(n+" ");
    }
    static void printNumbers(int start,int n){
        if(start==n+1){
            return;
        }
        printNumbers(start+1,n);
        System.out.print(start+" ");
    }


    public static void main(String[] args) {
        int n=230;
        printNumbers(1,n);
    }
}
