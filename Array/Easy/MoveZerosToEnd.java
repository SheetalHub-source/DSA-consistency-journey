package Easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeroes(int[] arr) {
        int i =0;
        int count =0;
        for(int curr =0;curr<arr.length;curr++){
            if(arr[curr]==0) count++;
            else {
                arr[i++]=arr[curr];       
            }
        }
       int j = arr.length-1;
       while(count>0){
        arr[j]=0;
        j--;count--;
       }
    }
    public static void main(String[] args) {
       int[] arr ={1,2,0,7,4,0,5,0,3,0};
        System.out.println("Original Array: ");
        Arrays.stream(arr).forEach(x->System.out.print(x+" "));
        int n = arr.length;
       moveZeroes(arr);
        System.out.println("\nOutput Array ");
    Arrays.stream(arr).forEach(x->System.out.print(x+" ")); 
    }
}
