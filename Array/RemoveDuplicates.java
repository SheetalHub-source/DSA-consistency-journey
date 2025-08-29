public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int curr = nums[0];
        int k = 1, j = 1, i = 1;
        while (i < nums.length) {
            if (nums[i] == curr) {
                i++;
            } else {
                curr = nums[i++];
                nums[j++] = curr;
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 3, 3, 3, 3, 3, 3, 4, 4, 5 };
        int k = removeDuplicates(arr);
        System.out.println(k);
        System.out.println("Distict elements that are presented in the array are " + k);
        for (int x = 0; x < k; x++) {
            System.out.print(arr[x] + " ");
        }

    }
}
