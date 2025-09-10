package Medium;

public class PrintSubarrayWithMaxSubarraySum {
   static int maxSumSubarray(int[] arr) {
    int max_so_far = arr[0], max_ending_here = arr[0];
    int start = 0, end = 0, s = 0;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max_ending_here + arr[i]) {
            max_ending_here = arr[i];
            s = i;
        } else {
            max_ending_here += arr[i];
        }

        if (max_ending_here > max_so_far) {
            max_so_far = max_ending_here;
            start = s;
            end = i;
        }
    }

    System.out.print("Subarray: ");
    for (int i = start; i <= end; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    return max_so_far;
}


    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSumSubarray(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}
