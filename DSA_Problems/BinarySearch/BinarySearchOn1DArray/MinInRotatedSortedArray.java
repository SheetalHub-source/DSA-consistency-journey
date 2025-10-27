package BinarySearch.BinarySearchOn1DArray;


public class MinInRotatedSortedArray {
    /*public static int minValue(int[] arr){
        int n = arr.length;
        int low =0,high=n-1;
        int min = Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<min) min = arr[mid];
            if(arr[low]==arr[mid]&&arr[mid]==arr[high]) {
                high=high-1;
                low=low+1;
                continue;
            }
            if(arr[low]<=arr[high]) high=mid-1;
            else low=mid+1;
        }
        return min;
    }*/
    public static int minValue(int[] arr){
        int n = arr.length;
        int low =0,high=n-1;
      //  int min = Integer.MAX_VALUE;
        while(low<high){
            int mid=low+(high-low)/2;
            /*if(arr[mid]<min) min = arr[mid];
            if(arr[low]<=arr[mid]&&arr[mid]<=arr[high]) high = mid-1;
            else if(arr[mid]<arr[low]) high=mid-1;
            else*/ if(arr[mid]>arr[high]) low=mid+1;
            else high=mid;
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int arr[]={2,1};
        System.out.println(minValue(arr));
    }
}
