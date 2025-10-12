import java.util.Arrays;

public class CountSort {

    public static void basicCountSort(int[] arr) {
       int max= findMax(arr); 
       int count[] = new int[max+1];
       for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
       }

       int k=0;
       for(int i=0;i<count.length;i++){
        for(int j=0;j<count[i];j++){
       arr[k++]=i;
        }
       }
    }
    private static int findMax(int[] arr) {
       int max = Integer.MIN_VALUE;
       for(int i:arr){
        if(i>max){
            max=i;
        }
       }
       return max;
    }
    public static void main(String[] args) {
         int[] arr ={3,7,4,3,7,9,0};
        System.out.println("Before sorting array:");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        
        basicCountSort(arr);
        
        System.out.println("\nAfter sorting array:");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}