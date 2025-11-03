package BinarySearch.BinarySearchOnAnswers;

import java.util.Scanner;

public class Sqrt_N {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Square root of n is: "+mySqrt(n));
        sc.close();
    }

    private static int mySqrt(int n) {
        if(n<2) return n;
        int left =1;
        int right = n/2;
        int ans =-1;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(mid*mid<=n){
                ans=(int) mid;
                left = (int) (mid+1);
            }
            else{
                right= (int) (mid-1);
            }

        }
        return ans;
    }
}
