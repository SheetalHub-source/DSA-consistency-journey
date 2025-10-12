package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        sort2DArray(intervals);
        List<int[]> res = new ArrayList<>();
        int start = -1;
        int end = -1;
        int n = intervals.length;
        for(int i =0;i<n;i++){
            if(intervals[i][0]>end&&intervals[i][1]>end){
                if(start!=-1&&end!=-1){
                    res.add(new int[]{start,end});
                }
                start =intervals[i][0];
                end=intervals[i][1];
            }
            else if(intervals[i][0]<=end&&intervals[i][1]>end){
                end = intervals[i][1];
            }
        }
        if(start!=-1&&end!=-1){
            res.add(new int[]{start,end});
        }
        return res.toArray(new int[res.size()][]);
    }
    public static void sort2DArray(int[][] arr) {
        for (int[] row : arr) {
            if (row[0] > row[1]) {
                int temp = row[0];
                row[0] = row[1];
                row[1] = temp;
            }
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {4, 1},
                {4, 7},
                {10, 8},
                {15, 18}
        };

        int[][] merge = merge(intervals);
        for(int i =0;i<merge.length;i++){
            System.out.println(merge[i][0]+" "+merge[i][1]);
        }

    }
}
