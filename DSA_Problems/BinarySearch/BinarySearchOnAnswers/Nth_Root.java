package BinarySearch.BinarySearchOnAnswers;

public class Nth_Root {
    public static int NthRoot(int N, int M) {
        if(N==1) return M;
        int left =1;
        int right = M/2;
        while(left<=right){
            long mid=left+(right-left)/2;
            int nthVal = NthVal(mid,N);
            if(nthVal==M) return (int) mid;
           else if(nthVal<M){
                left = (int) (mid+1);
            }
            else{
                right= (int) (mid-1);
            }

        }
        return -1;
    }

    private static int NthVal(long mid, int n) {
        int ans =1;
        while(n>0){
            ans*=mid;
            n--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 4;
        int M = 69;
        System.out.println("Nth root of M is: "+NthRoot(N,M));
    }
}
