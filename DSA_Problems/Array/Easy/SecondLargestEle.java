package Array.Easy;

public class SecondLargestEle {
    public static int secondLargestElement(int[] nums) {
    int max = Integer.MIN_VALUE;
    int secMax = Integer.MIN_VALUE;
    for (int num : nums) {
      if (num > max) {
        secMax = max;
        max = num;
      } else if (num < max && num > secMax) {
        secMax = num;
      }
    }
    if (secMax == Integer.MIN_VALUE) return -1;
    return secMax;
  }
     public static void main(String[] args) {
    int arr[]={1,2,4,5,6,7,8,7};
    System.out.println("Second largest element is: "+secondLargestElement(arr));
   } 
}
