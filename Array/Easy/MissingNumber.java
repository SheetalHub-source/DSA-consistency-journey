package Easy;

public class MissingNumber {
     public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int sum =0;
        for(int num:nums){
            sum+=num;
        }
        return totalSum-sum;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int missing = missingNumber(arr);
        System.out.println("The missing number is: " + missing);
}
}
