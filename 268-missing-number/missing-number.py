class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        x=nums[0]
        for i in range(1,n):
            x=x^nums[i]
        for i in range(1,n+1):
            x=x^i
        return x
        