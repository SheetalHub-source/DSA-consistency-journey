public class isSorting {
     public static boolean isSorted(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                return false;
            }
        }
         return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int arr1[] = {1,32,45,67,3,12,5};
        System.out.println("The given array is sorted in non-decreasing: "+isSorted(arr));
        System.out.println("The given array is sorted in non-decreasing: "+isSorted(arr1));
    }
}
