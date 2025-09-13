package Medium;

import java.util.ArrayList;

public class SpriralTraversal {
    public static ArrayList<Integer> spriralMatrix(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        int top = 0,bottom=m-1,left=0,right=n-1;
        while(top<=bottom&&left<=right){
            for (int i = left; i <= right; ++i) {
                res.add(mat[top][i]);
            }
            top++;

            // Print right column from top to bottom
            for (int i = top; i <= bottom; ++i) {
                res.add(mat[i][right]);
            }
            right--;

            // Print bottom row from right to left (if exists)
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }

            // Print left column from bottom to top (if exists)
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    res.add(mat[i][left]);
                }
                left++;
            }
        }

        return res;


    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        ArrayList<Integer> result = spriralMatrix(matrix);
        System.out.println(result);
    }
}
