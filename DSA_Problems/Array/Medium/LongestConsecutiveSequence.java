package Array.Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] arr) {
        int res =0;
        int n = arr.length;
        Set<Integer> st = new HashSet<>();
        for(int num:arr){
            st.add(num);
        }

        for(int i =0;i<n;i++){
            if(st.contains(arr[i])&&!st.contains(arr[i]-1)){//first ele of sequence
                int curr = arr[i];
                int count=0;
                while(st.contains(curr)){
                    st.remove(curr);
                    curr++;
                    count++;
                }
                res = Math.max(res,count);
            }
        }
        return res;
    }
    public static void main(String[] args) {
    int arr[] = {100, 4, 200, 1, 3, 2};
    System.out.println("Length of longest consecutive sequence is: " + longestConsecutive(arr));
    }
}
