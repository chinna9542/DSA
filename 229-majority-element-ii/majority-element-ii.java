class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int el1=999;
        int el2=999;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(c1==0&&el2!=nums[i]){
                c1=1;
                el1=nums[i];
            }
            else if(c2==0&&el1!=nums[i]){
                c2=1;
                el2=nums[i];
            }
            else if(el1==nums[i]){
                c1++;
            }
            else if(el2==nums[i]){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
        }
        if(cnt1>nums.length/3) l.add(el1);
        if(cnt2>nums.length/3) l.add(el2);
        return l;
    }
}