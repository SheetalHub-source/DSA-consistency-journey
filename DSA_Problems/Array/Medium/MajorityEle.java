package Array.Medium;

import java.util.Arrays;

public class MajorityEle {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        MajorityEle obj = new MajorityEle();
        System.out.println(obj.majorityElement(arr));
    }
}
