package BinarySearch.BinarySearchOn1DArray;

public class PeakElement {
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 20, 4, 1, 0, 6, 5};
        System.out.println("Index of a peak element is: " + findPeakElement(arr));
    }
}
