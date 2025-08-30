import java.util.Arrays;

public class RotateArrayByOne {
     public static void rotateArrayByOne(int[] arr) {
        int n = arr.length;
        int first = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=first;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        Arrays.stream(arr).forEach(x->System.out.print(x+" "));
        int n = arr.length;
       rotateArrayByOne(arr);
        System.out.println("\nRotated Array ");
    Arrays.stream(arr).forEach(x->System.out.print(x+" "));
    }
}
