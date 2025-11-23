class Solution {
    static int helper(int i,int n,int dp[],int nums[]){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int include=nums[i]+helper(i+2,n,dp,nums);
        int exclude=helper(i+1,n,dp,nums);
        return dp[i]=Math.max(include,exclude);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(0,n,dp,nums);
    }
}