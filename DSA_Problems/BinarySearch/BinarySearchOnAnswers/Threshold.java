package BinarySearch.BinarySearchOnAnswers;

public class Threshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for (int num : nums) {
            if (num > high) high = num;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = 0;

            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }

            if (sum > threshold) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Threshold obj = new Threshold();
        int arr[]={7, 17, 20, 3};
        int threshold=10;
        System.out.println(obj.smallestDivisor(arr,threshold));
    }
}
