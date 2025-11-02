package Array.Easy;

import java.util.Arrays;

public class NumberSmallerThenCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedArray = nums.clone();
        Arrays.sort(sortedArray);
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = search(sortedArray, nums[i]);
        }
        return nums;
    }

    private static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result)); // Output: [4, 0, 1, 1, 3]
    }
}
