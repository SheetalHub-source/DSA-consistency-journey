package BinarySearch.BinarySearchOnAnswers;

public class KokoEatingBanana {
    public  static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int num : piles) {
            if (num > high) high = num;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = 0;

            for (int num : piles) {
                sum += (num + mid - 1) / mid;
            }

            if (sum > h) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[]={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(arr,h));
    }
}
