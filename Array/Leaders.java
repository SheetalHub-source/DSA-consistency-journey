import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Leaders{
     public List<Integer> leaders(int[] nums) {
        int n = nums.length;
        List<Integer> leaders = new ArrayList<>();
        leaders.add(nums[n-1]);
        int large = nums[n-1];
        for(int i =n-2;i>=0;i--){
            if(nums[i]>large){
                leaders.add(nums[i]);
                large=nums[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        Leaders obj = new Leaders();    
        System.out.println(obj.leaders(arr));
    }
}