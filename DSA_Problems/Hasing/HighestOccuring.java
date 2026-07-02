package Hasing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuring {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5,9,9,9,9,9,8};
        int res = highestOccuring(arr);
        System.out.println("The highest occurring element is: " + res);
    }

    private static int highestOccuring(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        int res = -1;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()>res) res = entry.getKey();
        }
        return res;
    }
}
