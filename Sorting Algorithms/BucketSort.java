import java.util.*;

public class BucketSort {
    
    public static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n <= 0) return;

     
        @SuppressWarnings("unchecked")
        List<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (float num : arr) {
            int bucketIndex = (int)(num * n); 
            buckets[bucketIndex].add(num);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]); 
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float num : buckets[i]) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = { (float)0.42, (float)0.32, (float)0.23,
                        (float)0.52, (float)0.25, (float)0.47, (float)0.51 };

        System.out.println("Before sorting: " + Arrays.toString(arr));
        bucketSort(arr);
        System.out.println("After sorting:  " + Arrays.toString(arr));
    }
}
