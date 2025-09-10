package Medium;

public class SortColors {
     private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void sortColors(int[] nums) {
        int left = -1;
        int right = nums.length;
        int curr = 0;
        while(curr<right){
            if (nums[curr] == 0) {
                left++;
                swap(nums, left, curr);
                curr++;
            } else if (nums[curr] == 2) {
                right--;
                swap(nums, right, curr);
            } else {
                curr++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,0,0,1,2,0,2,2,1,0,1,0};
        sortColors(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
