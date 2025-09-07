class RearrangeEleBySign {
  public static int[] rearrangeArray(int[] nums) {
       int[] result = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 1;
              for (int number : nums) {
            if (number > 0) {
                result[positiveIndex] = number;
                positiveIndex += 2;
            } else {
                result[negativeIndex] = number;
                negativeIndex += 2;
            }
        }
      
        return result; 
    }
  public static void main(String[] args) {
    int[] nums = {3, -2, 1, -5, 2, -4};
    int[] rearrangedArray = rearrangeArray(nums);
    for (int num : rearrangedArray) {
      System.out.print(num + " ");
    }
  }  
}