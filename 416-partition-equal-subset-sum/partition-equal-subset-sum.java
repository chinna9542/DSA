class Solution {
    static boolean k(int t,boolean dp[][],int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++) dp[i][0]=true;
        if(arr[0]<=t) dp[0][arr[0]]=true;
        for(int idx = 1; idx < n; idx++){
            for(int tar = 0; tar <= t; tar++){
                boolean notTake = dp[idx-1][tar];
                boolean take = false;
                if(arr[idx] <= tar){
                    take = dp[idx-1][tar - arr[idx]];
                }
                dp[idx][tar] = take||notTake;
            }
        }
        return dp[n-1][t];

    }
    public boolean canPartition(int[] nums) {
        int t=0;
        for(int i:nums) t+=i;
        if(t%2!=0) return false;
        int n=nums.length;
        boolean dp[][]=new boolean[n][t/2+1];
        return k(t/2,dp,nums);
    }
}