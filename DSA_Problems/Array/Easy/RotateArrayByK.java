package Array.Easy;

import java.util.Arrays;

public class RotateArrayByK {
    
   static class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k = k%n;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
        System.gc();
    }
    public void reverse(int i,int j,int[] arr){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
}
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        Arrays.stream(arr).forEach(x->System.out.print(x+" "));
        int n = arr.length;
        Solution sol = new Solution();
        sol.rotate(arr, 3);
        System.out.println("\nRotated Array ");
    Arrays.stream(arr).forEach(x->System.out.print(x+" "));
    }   
    }

