class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        int i=0;
        int j=matrix[0].length-1;
        while(i<j){
            for(int k=0;k<matrix.length;k++){
                int t=matrix[k][i];
                matrix[k][i]=matrix[k][j];
                matrix[k][j]=t;
            }
            i++;
            j--;
        }
    }
}