package Array.Easy;

import java.util.ArrayList;

public class FindUnion {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int i=0,j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<a.length&&j<b.length){
        if(a[i]<=b[j]){
            if(ans.isEmpty()) ans.add(a[i]);
            else if(!ans.isEmpty()&&ans.get(ans.size()-1)!=a[i]){
                ans.add(a[i]);
            }
            i++;
        }
        else if(b[j]<a[i]){
             if(ans.isEmpty()) ans.add(b[j]);
            else if(!ans.isEmpty()&&ans.get(ans.size()-1)!=b[j]){
                ans.add(b[j]);
            }
            j++;
        }
        }
        while(i<a.length){
          if(ans.isEmpty()) ans.add(a[i]);
            else if(!ans.isEmpty()&&ans.get(ans.size()-1)!=a[i]){
                ans.add(a[i]);
            }
            i++;  
        }
        while(j<b.length){
            if(ans.isEmpty()) ans.add(b[j]);
            else if(!ans.isEmpty()&&ans.get(ans.size()-1)!=b[j]){
                ans.add(b[j]);
            }
            j++; 
        }
      return ans;  
    }
    public static void main(String[] args) {
       int[]a={1, 1, 1, 1, 1};
       int[]b={2, 2, 2, 2, 2};
       ArrayList<Integer> ans  = findUnion(a, b);
    System.out.println(ans);
    }
}
