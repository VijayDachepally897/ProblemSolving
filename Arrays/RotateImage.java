class Solution {
    public void rotate(int[][] matrix) {
        int[][] twoD_arr = new int[matrix.length][matrix.length];
        int n=matrix.length-1;
        for(int i=0;i<matrix.length;i++)
        { 
            for(int j=0;j<matrix.length;j++)
            {
                twoD_arr[j][n-i]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++)
        { 
            for(int j=0;j<matrix.length;j++)
            {
                matrix[i][j]=twoD_arr[i][j];
            }
        }
    }
}