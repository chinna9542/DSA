class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums) sum+=num;
        if(sum%2==1) return false;
        int t=sum/2;
        int dp[]=new int[t+1];
        dp[0]=1;
        for(int num:nums){
            for(int j=t;j>=num;j--){
                dp[j]+=dp[j-num];
            }
        }
        if(dp[t]==0) return false;
        else return true;
    }
}