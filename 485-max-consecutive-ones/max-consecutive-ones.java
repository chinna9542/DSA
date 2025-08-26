class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) c++;
            else{
                max=Math.max(max,c);
                c=0;
            }
        }
        max=Math.max(max,c);
        return max;
    }
}