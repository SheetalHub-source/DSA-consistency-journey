package BinarySearch.BinarySearchOn1DArray;

public class SortedArrayRotationCount {
    public static int findRotationCount(int[] arr) {
        int n = arr.length;
        int low = 0;int high = n-1;
        while (low<high){
          int mid=  low+(high-low)/2;
          if(arr[mid]>arr[high]) low = mid+1;
          else high = mid;
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,3,4,5};
        System.out.println("Rotation count of the given array is "+findRotationCount(arr));
    }
}
