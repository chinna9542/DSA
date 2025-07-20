class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> l=new ArrayList<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=target-a;
            if(l.contains(b)&&i!=l.indexOf(b)){
                res[0]=i;
                res[1]=l.indexOf(b);
            }
        }
        return res;
    }
}