package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        res.add(list);

        for(int i =2;i<numRows+1;i++){
            List<Integer> prev = res.get(res.size()-1);
            int arr[]= new int[i];
            int left=1,right=arr.length-2;
            arr[0]=arr[arr.length-1]=1;
            if(i>2) {
                for (int j = 0; j < i / 2; j++) {
                    int val = prev.get(j)+prev.get(j+1);
                    arr[left] = arr[right] = val;
                    left++;
                    right--;
                }
            }
            List<Integer> subList = Arrays.stream(arr)  // IntStream
                    .boxed()     // convert int -> Integer
                    .collect(Collectors.toList());
            res.add(subList);
        }
        return res;
    }
    public static List<List<Integer>> optimalGenerate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(row);
        }
        return res;
    }
    public static void main(String[] args) {
        int num = 30;
        long start = System.currentTimeMillis();

        List<List<Integer>> res = generate(num);
       for(List<Integer> list:res){
           System.out.println(list);
       }
        double timeInSeconds = (System.currentTimeMillis() - start) / 1000.0;
        System.out.println("Time taken: " + timeInSeconds + " seconds");
    }
}
