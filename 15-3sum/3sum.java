class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                List<Integer> nl=new ArrayList<>();
                nl.add(nums[i]);
                nl.add(nums[j]);
                nl.add(nums[k]);
                l.add(nl);
                j++;
                k--;
                while (j < k && nums[j] == nums[j - 1]) j++;
                while (j < k && nums[k] == nums[k + 1]) k--;
                }else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return l;
    }
}