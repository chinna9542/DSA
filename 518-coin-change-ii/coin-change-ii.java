class Solution {
    static int helper(int i,int coins[],int amount,int dp[][]){
        if(i==0){
            if(amount%coins[i]==0){
                return 1;
            }else{
                return 0;
            }
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        int nottake=helper(i-1,coins,amount,dp);
        int take=0;
        if(coins[i]<=amount) take=helper(i,coins,amount-coins[i],dp);
        return dp[i][amount]=take+nottake;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int row[]:dp) Arrays.fill(row,-1);
        int ans=helper(n-1,coins,amount,dp);
        return ans;
    }
}