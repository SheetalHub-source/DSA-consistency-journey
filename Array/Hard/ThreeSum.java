package Hard;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSumBruteForce(int[] nums) {
        HashSet<List<Integer>> hs = new HashSet<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum==0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.sort(null);
                        hs.add(list);
                    }
                    }
                }
            }
        List<List<Integer>> res = new ArrayList<>(hs);
        return res;
    }
    public static List<List<Integer>> threeSumBetterForce(int[] arr){
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);

                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println(threeSumBruteForce(arr));
    }
}
