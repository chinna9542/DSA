class Solution {
    static void r(int nums[],int i,int j){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int k=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                k=i;
                break;
            }
        }
        if(k>=0){
            int j=n-1;
            while(nums[j]<=nums[k]){
                j--;
            }
            int t=nums[k];
            nums[k]=nums[j];
            nums[j]=t;
        }
        r(nums,k+1,n-1);
    }
}