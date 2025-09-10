package Medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1]+"]");
        } else {
            System.out.println("No two sum solution found.");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> numberToIndex = new HashMap<>();
                for (int i = 0; ; ++i) {
                    int currentNumber = nums[i];
                    int complement = target-currentNumber;
                    if(numberToIndex.containsKey(complement)){
                        return new int[]{i,numberToIndex.get(complement)};
                    }
                    numberToIndex.put(currentNumber,i);
                }
    }
    
}
