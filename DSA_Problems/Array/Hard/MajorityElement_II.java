package Array.Hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_II {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int candidate1=-1,candidate2 = -1;
        int vote1=0,vote2=0;
        for(int num :nums){
       if(num==candidate1) vote1++;
       else if(num==candidate2) vote2++;
       else if (vote1==0) {
          candidate1 = num;
          vote1=1;
       } else if (vote2==0) {
          candidate2=num;
          vote2=1;
       }
       else {
           vote1--;
              vote2--;
       }
        }
        vote1=vote2=0;
        for(int num:nums){
            if(num==candidate1){
                vote1++;
            }
            else if(num==candidate2){
                vote2++;
            }
        }
        if(vote1>nums.length/3) res.add(candidate1);
        if(vote2>nums.length/3) res.add(candidate2);
        return res;
    }
    public static void main(String[] args) {
   int[] nums = {0,3,4,1,0};
   System.out.println(majorityElement(nums));
    }
}
