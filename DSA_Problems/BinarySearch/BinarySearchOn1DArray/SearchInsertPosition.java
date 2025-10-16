package BinarySearch.BinarySearchOn1DArray;

public class SearchInsertPosition {
    public int searchInsert(int[] arr, int target) {
        int left = 0,right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition obj = new SearchInsertPosition();
        int[] arr = {1,3};
        int target = 2;
        System.out.println(obj.searchInsert(arr,target));
    }
}
