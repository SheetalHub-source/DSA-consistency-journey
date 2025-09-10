package Easy;

public class MaxConsecutiveOnes {
      public static int findMaxConsecutiveOnes(int[] nums) {
       int count = 0, ans = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        return Math.max(ans, count);
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(arr);
        System.out.println("The maximum number of consecutive 1s is: " + maxConsecutiveOnes);
    }
}
