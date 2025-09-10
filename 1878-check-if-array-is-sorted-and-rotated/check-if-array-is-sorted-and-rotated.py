class Solution:
    def check(self, nums: List[int]) -> bool:
        c=0
        for i in range(0,len(nums)):
            if(nums[i]>nums[(i+1)%len(nums)]):
                c=c+1
        return c<=1