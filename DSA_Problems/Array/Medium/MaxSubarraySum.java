package Array.Medium;

public class MaxSubarraySum {
     public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int curr =0;
        for(int num:nums){
            curr+=num;
              maxSum=maxSum>curr?maxSum:curr;
            if(curr<0) curr=0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum is: "+maxSubArray(arr));
    }
}
