class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=0;
        int e=0;
        for(int i=0;i<n;i++){
            if(c==0){
                e=nums[i];
                c=1;
            }
            else if(nums[i]==e){
                c++;
            }else{
                c--;
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==e) cnt++;
        }
        if(cnt>n/2) return e;
        else return -1;
    }
}