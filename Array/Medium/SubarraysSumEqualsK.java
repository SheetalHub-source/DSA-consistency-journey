package Medium;

import java.util.HashMap;

public class SubarraysSumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int preSum = 0;
        int count = 0;

        for (int num : nums) {
            preSum += num;

            if (hm.containsKey(preSum - k)) {
                count += hm.get(preSum - k);
            }

            hm.put(preSum, hm.getOrDefault(preSum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int arr []={1,2,4,7,1,5,9,7,5,2};
        int arr2[]={0,0,0,0};
        System.out.println(subarraySum(arr2,0));
    }
}
