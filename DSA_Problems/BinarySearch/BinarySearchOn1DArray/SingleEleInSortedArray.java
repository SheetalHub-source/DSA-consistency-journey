package BinarySearch.BinarySearchOn1DArray;

public class SingleEleInSortedArray {
    /*public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if (n==1) return arr[0];
        int low =0,high=n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((mid%2!=0&&mid+1<n&&arr[mid]==arr[mid+1])||(mid%2==0&&mid-1>=0&&arr[mid]==arr[mid-1])){
                high =mid-1;
            }
            else if((mid%2!=0&&mid-1>=0&&arr[mid]==arr[mid-1])||(mid%2==0&&mid+1<n&&arr[mid]==arr[mid+1])) low=mid+1;
            else return arr[mid];
        }
        return -1;
    }
*/
    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];

        int low = 0, high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid % 2 == 1) mid--;

            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {

        int arr[]={0,0,1,1,2,3,3};
        System.out.println(singleNonDuplicate(arr));
    }
}
