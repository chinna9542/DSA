class Solution {
    static int helper(int arr[],int target){
        int n=arr.length;
        int dp[][]=new int[n][target+1];
        if(arr[0]==0) dp[0][0]=2;
        else dp[0][0]=1;
        if(arr[0]!=0 && arr[0]<=target) dp[0][arr[0]]=1;
        for(int idx=1;idx<n;idx++){
            for(int tar=0;tar<=target;tar++){
                int notTake=dp[idx-1][tar];
                int take=0;
                if(arr[idx]<=tar){
                    take=dp[idx-1][tar-arr[idx]];
                }
                dp[idx][tar]=take+notTake;
            }
        }
        return dp[n-1][target];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums) sum+=i;
        if((sum-target)<0||(sum-target)%2!=0) return 0;
        return helper(nums,(sum-target)/2);
    }
}