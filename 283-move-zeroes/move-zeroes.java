class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int t=nums[i];
                nums[i]=nums[k];
                nums[k]=t;
                k++;
            }
        }
    }
}