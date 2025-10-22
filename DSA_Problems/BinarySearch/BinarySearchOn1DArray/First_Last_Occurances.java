package BinarySearch.BinarySearchOn1DArray;

public class First_Last_Occurances {
    public static int[] searchRangeII(int[] nums, int target) {
        int i=0,n=nums.length,j=n-1,first=-1,last=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                first = last=mid;
                i=mid-1;
                j=mid+1;
                break;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else j=mid-1;
        }
        while(i>=0&&i<n&&n>0&&nums[i]==target) {
            first=i;
            i--;
        }
        while(j<n&&n>0&&j>=0&&nums[j]==target){
            last = j;
            j++;
        }
        return new int[]{first,last};
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1; // keep searching left part
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1; // keep searching right part
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums = {1};
        int target = 6;
        int[] ans = searchRange(nums,target);
        System.out.println("First Occurence: "+ans[0]+" \nLast Occurence: "+ans[1]);
    }
    }
