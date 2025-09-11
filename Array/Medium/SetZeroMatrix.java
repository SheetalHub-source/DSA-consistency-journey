package Medium;

public class SetZeroMatrix {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] flag = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]!=0){
                    flag[i][j]=-1;
                }
            }
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(flag[i][j]!=-1&&matrix[i][j]==0){
                    for(int k=0;k<m;k++){
                        matrix[k][j]=0;
                    }
                    for(int k =0;k<n;k++){
                        matrix[i][k]=0;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,1,2,0,4,6,67,8,5,52,3,6,7,8,9,2},
            {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6},
            {4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9},
            {7,8,9,1,1,2,3,4,5,6,7,8,9,0,1,2},
            {2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7},
            {3,4,5,6,7,8,9,1,1,2,3,4,5,6,7,8},
            {5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,1},
        };
        setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
