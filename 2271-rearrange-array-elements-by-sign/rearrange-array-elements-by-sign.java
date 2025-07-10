class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int res[]=new int[l];
        int p=0;
        int n=1;
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                res[p]=nums[i];
                p+=2;
            }else{
                res[n]=nums[i];
                n+=2;
            }
        }
        return res;
    }
}