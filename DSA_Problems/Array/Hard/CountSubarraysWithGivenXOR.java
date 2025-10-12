package Array.Hard;

import java.util.HashMap;

public class CountSubarraysWithGivenXOR {
    public static long subarrayXor(int arr[], int k) {
        int xr = 0;
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(xr,1);
        // code here
        for(int i =0;i<arr.length;i++){
            xr = arr[i]^xr;

            int x =xr^k;
            if(hm.containsKey(x)){
                count+=hm.get(x);
            }
            if (hm.containsKey(xr)) {
                hm.put(xr, hm.get(xr) + 1);
            } else {
                hm.put(xr, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={4,2,2,6,4};
        int k =6;
        System.out.println(subarrayXor(arr,k));
    }
}
