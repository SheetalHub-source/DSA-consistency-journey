package Hard;

import java.util.HashMap;
import java.util.Map;

public class RepeatingAndMissing {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>1){
                ans[0]= entry.getKey();
            }
        }
        for(int i =1;i<=n;i++){
           if(!hm.containsKey(i)){
               ans[1]=i;
           }
        }
    return  ans;
    }
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;

        long S = 0;   // sum of elements in nums
        long S2 = 0;  // sum of squares of elements in nums

        for (int num : nums) {
            S += num;
            S2 += (long) num * num;
        }

        long Sn = (long) n * (n + 1) / 2;                     // 1 + 2 + ... + n
        long S2n = (long) n * (n + 1) * (2 * n + 1) / 6;      // 1^2 + 2^2 + ... + n^2

        long diff = S - Sn;                                   // A - B
        long squareDiff = S2 - S2n;                           // A^2 - B^2

        long sum = squareDiff / diff;                         // A + B

        long A = (diff + sum) / 2;                            // repeating number
        long B = A - diff;                                    // missing number

        return new int[]{(int) A, (int) B};
    }
    public static void main(String[] args) {
   int[] nums = {6, 5, 7, 1, 8, 6, 4, 3, 2};
        int[] missingRepeatingNumbers = findErrorNums(nums);
        for(int num:missingRepeatingNumbers){
            System.out.print(num+" ");
        }
    }
}
