package BinarySearch.BinarySearchOn1DArray;

public class SearchInRotatedSortedArray_II {
    public static boolean search(int[] arr, int k) {
int n = arr.length;
int low = 0;
int high = n-1;
while (low<=high){
    int mid= low+(high-low)/2;
    if(arr[mid]==k) return true;
    if(arr[low]==arr[mid]&&arr[mid]==arr[high]){// we can't decide which part is sorted, just move the pointers closer
        low++;
        high--;
        continue;
    }
    if(arr[low]<arr[mid]){// left part is sorted, and we should check the element in it first
        if(arr[low]<=k&&arr[mid]>=k){// target is present in this area so we have to do
            high=mid-1;
        }
        else low = mid+1;
    }
    else if(arr[low]==arr[mid]){
        
    }
    else{//right part is sorted
        if(arr[mid]<=k&&k<=arr[high]){
            low=mid+1;
        }
        else high = mid-1;

    }
}
return false;
    }

    public static void main(String[] args) {
        int[] arr={1,0,1,1,1};
        int target = 0  ;
        System.out.println(search(arr,target));
    }
}
