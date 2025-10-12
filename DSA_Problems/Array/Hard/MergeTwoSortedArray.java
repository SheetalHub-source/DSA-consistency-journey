package Array.Hard;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0,j=0,idx=0;
        int arr1[]=new int[m];
        for(int val=0;val<m;val++){
            arr1[val]=nums1[val];
        }
        while(i<m&&j<n){
            if(arr1[i]<=nums2[j]){
                nums1[idx++]=arr1[i++];
            }
            else{
                nums1[idx++]=nums2[j++];
            }
        }
        while(i<m){
            nums1[idx++]=arr1[i++];
        }
        while(j<n){
            nums1[idx++]=nums2[j++];
        }
    }
    public static void mergeWithoutExtraSpace(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;       // last valid element in nums1
        int j = n - 1;       // last element in nums2
        int k = m + n - 1;   // last position in nums1 (total size)

        // Merge from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 has remaining elements, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,3,4};
        int n = 3;
        mergeWithoutExtraSpace(nums1,m,nums2,n);
        for(int val:nums1){
            System.out.print(val+" ");
        }
    }
}
