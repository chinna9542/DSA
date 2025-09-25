class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,max=0,z=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0) z++;
            while(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}