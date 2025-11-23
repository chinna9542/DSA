class Solution {
    static int k(int n,int dp[]){
        if(n<=1) return 1; 
        if(dp[n]!=-1) return dp[n];
        return dp[n]=k(n-1,dp)+k(n-2,dp);
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return k(n,dp);
    }
}