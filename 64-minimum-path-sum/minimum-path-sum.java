class Solution {
    static int helper(int i,int j,int[][] grid,int[][] dp){
        if(i==0&&j==0) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int left=Integer.MAX_VALUE;
        if(j>0) left=helper(i,j-1,grid,dp);
        int right=Integer.MAX_VALUE;
        if(i>0) right=helper(i-1,j,grid,dp);
        return dp[i][j]=grid[i][j]+Math.min(left,right);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m+1][n+1];
        for(int row[]:dp) Arrays.fill(row,-1);
        return helper(m-1,n-1,grid,dp);
    }
}