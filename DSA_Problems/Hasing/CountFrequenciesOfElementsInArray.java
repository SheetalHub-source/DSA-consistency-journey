package Hasing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequenciesOfElementsInArray {
    public static void countFrequencies(int[] arr) {
//        int n = arr.length;
//        boolean[] visited = new boolean[n];
//
//        for (int i = 0; i < n; i++) {
//            if (visited[i]) {
//                continue;
//            }
//
//            int count = 1;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    visited[j] = true;
//                    count++;
//                }
//            }
//
//            System.out.println(arr[i] + " occurs " + count + " times");
//        }
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        countFrequencies(arr);
    }
}
