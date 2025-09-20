package Hard;

import java.util.HashMap;

public class LargestSubarrayWithZeroSum {
    static int maxLength(int arr[]) {
        int n =arr.length;
        int len =0;
        int sum =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<n;i++){
            sum+=arr[i];
            if(sum==0) len = Math.max(len,i+1);
            if(hm.containsKey(sum)){
                int j = hm.get(sum);
                len = Math.max(len,i-j);
            }
            else{
                hm.put(sum,i);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int arr[]={0, 0, 0, 0,1, 0};
        System.out.println(maxLength(arr));
    }
}
