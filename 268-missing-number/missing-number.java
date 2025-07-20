class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int b=Arrays.stream(nums).sum();
        int a=n*(n+1)/2;
        return a-b;
    }
}