package BinarySearch.BinarySearchOn1DArray;

public class ImplementLowerBound {
    static int lowerBound(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 9;
        int result = lowerBound(arr, target);

        System.out.println("Lower bound index: " + result);
    }
}
