class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][0]<=target&&matrix[i][n-1]>=target){
                int j=0;
                while(j<n){
                    if(matrix[i][j]==target){
                        return true;
                    }
                    j++;
                }
                break;
            }
        }
        return false;
    }
}