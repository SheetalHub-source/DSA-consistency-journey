class LargestEle {
    public static int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
    for(int num:nums){
        max = Math.max(num,max);
    }
    return  max;
    }
    public static void main(String[] args) {
        int nums[]={1,2,4,6,7,4,2,4,10};
        System.out.println("Greatest Element in the array is as follows :"+largestElement(nums));
    }
}