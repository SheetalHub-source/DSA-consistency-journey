package Array.Easy;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int single = singleNumber(arr);
        System.out.println("The single number is: " + single);
    }
}
