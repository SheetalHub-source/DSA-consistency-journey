package Array.Hard;

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
    public static List<List<Integer>> threeSumBetterApproach(int[] arr){
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
    public static List<List<Integer>> threeSumOptimalApproach(int[] arr){
      int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
          if(i>0&&arr[i]==arr[i-1]) continue;
          int j = i+1;
          int k = n-1;
          while(j<k){
              int sum = arr[i]+arr[j]+arr[k];
              if(sum<0){
                 j++;
              }
              else if(sum>0){
                k--;
              }
              else {
                  List<Integer> list = Arrays.asList(arr[i],arr[j],arr[k]);
                  res.add(list);
                  j++;k--;
                  while(j<k&&arr[j]==arr[j-1]) j++;
                  while(j<k&&arr[k]==arr[k+1]) k--;
              }
          }
      }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println(threeSumBruteForce(arr));
    }
}
